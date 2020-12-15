# 【翻译】类似“翻转对”问题背后的一般原则

> 原文：<https://leetcode.com/problems/reverse-pairs/discuss/97268/General-principles-behind-problems-similar-to-%22Reverse-Pairs%22>

基于`BST`、`BIT`、`Merge-Sort`等解法已经相当多了，因此，我更想针对这些解法和其它类似问题背后的一般原则进行一些讨论。

最基本的想法是**拆分数组，求解子问题**。

拆分数组，自然让我们想到子数组`subarray`。因此，为了使我们接下来的讨论更加顺利，作以下规定：

+ *`nums`*：输入的数组
+ *`n`*：输入数组的长度
+ *`nums[i,j]`*：从索引`i`到`j`（两者皆包含）的子数组
+ *`T(i,j)`*：适用于`nums[i,j]`子数组的同一问题（如在**翻转对**问题中，*`T(i,j)`*表示子数组`nums[i,j]`中所有**重要翻转对**的个数）

使用以上规定，原始的问题即为`T(0,n-1)`。现在关键点就是如何从子问题构造原始问题，这本质上是要建立`T(i,j)`的递推关系。因为，如果我们可以从`T(i,j)`的子问题中找到对于`T(i,j)`的解决方法，我们当然可以扩大子数组，获得更大的子数组的解决方法，直到最终获得整个数组的解决方法（注：这其实就是递归的思想罢了）。

建立`T(i,j)`的递归关系的方法有很多种，下面我将介绍两种比较常用的方式：

1. `T(i, j) = T(i, j - 1) + C`，将依次处理元素，那么**C**就是处理子数组`nums[i, j]`的最后一个元素即`nums[j]`的子问题。我们称之为顺序递推关系：`sequential recurrence relation`。
2. `T(i, j) = T(i, m) + T(m + 1, j) + C, m = (i + j)/2`,子数组`nums[i, j]`将进一步被划分为两部分，那么`C`就是合并两个部分的子问题。我们称之为分区递推关系：`partition recurrence relation`。

对于这两种情况，子问题**C**的性质将取决于具体求解的问题，求解该问题的方式将决定原始问题的总体复杂度。所以为了获得更好的性能，找到有效的算法来解决子问题是非常重要的。同时，也要注意子问题重叠的可能性，在这种情况下我们通常更倾向于使用动态规划进行求解。

下面，我将使用这两种递推关系应用到翻转对问题，并且给出一些解决方案供您参考。

---

**`I -- 顺序递推关系`**

同样的，我们假设输入`nums`数组具有`n`个元素，`T(i, j)`表示子数组`nums[i, j]`具有的所有**重要翻转对**的个数。对于顺序递推关系，我们可以简化运算，设置`i = 0`，这样以来，子数组总是从0开始，因此我们得到以下递推公式：

`T(0, j) = T(0, j - 1) + C`

此处的子问题**C**即为：

**计算第一个元素来自子数组`nums[0, j - 1]`，第二个元素为`nums[j]`时，重要翻转对的个数。**

注意对于`(p, q)`对，要想成为**重要翻转对**，必须满足两个条件：

1. `p < q`，即第一个元素必须在第二个元素之前出现
2. `nums[p] > 2 * nums[q]`，即第一个元素必须大于第二个元素的两倍

对于子问题**C**，第一个条件自然就被满足了，因此我们只需要考虑第二个条件，该条件等价于在子数组`nums[i, j - 1]`中查询所有大于`nums[j]`二倍的元素。

最直接的方法当然是线性扫描子数组，这即是时间复杂度为 $O(n^2)$的暴力解法。

对于该问题，为了提高搜索的效率，我们观察到子数组的顺序是无关紧要的，事实上，我们只需要关注所有大于`nums[j]`二倍的元素即**重要翻转对**的个数和即可。这意味着我们可以对这些元素进行排序，使用二元搜索方法而不是普通的线性搜索法进行改进。

如果搜索空间始终是固定的（即随着程序的运行，所需要搜索的元素数目不发生改变），那么使用二元搜索将十分完美，但是，对于本问题，在第`j`个元素运行之后，我们需要将其加入搜索空间，在下一次搜索也将使用到该元素，即随着所处理的元素的增多，搜索空间会不断扩大。

因此，我们希望在搜索和插入操作之中寻求平衡，这就是像二元搜索树（`BST`）或二元索引树（`BIT`）这样的数据结构占优的地方，它们为这两种操作均提供了相对快速的性能。

**1. 二元搜索树 解法**

我们定义树节点如下，`val`表示树结点的值，`cnt`表示以当前节点为根节点的子树中大于等于`val`的元素总数。

~~~java
class Node {
    int val, cnt;
    Node left, right;
        
    Node(int val) {
        this.val = val;
        this.cnt = 1;
    }
}
~~~

查找和插入操作如下：

~~~java
private int search(Node root, long val) {
    if (root == null) {
    	return 0;
    } else if (val == root.val) {
    	return root.cnt;
    } else if (val < root.val) {
    	return root.cnt + search(root.left, val);
    } else {
    	return search(root.right, val);
    }
}

private Node insert(Node root, int val) {
    if (root == null) {
        root = new Node(val);
    } else if (val == root.val) {
        root.cnt++;
    } else if (val < root.val) {
        root.left = insert(root.left, val);
    } else {
        root.cnt++;
        root.right = insert(root.right, val);
    }
    
    return root;
}
~~~

最后是主程序，在此过程中，我们将搜索不小于当前元素加1的两倍的所有元素（转换为长类型以避免溢出），同时将元素本身插入二元搜索树。

注意：该种方法构造`BST`事实上并不平衡，时间复杂度可能会达到$O(n^2)$，如果要确保$O(logn)$时间复杂度，需要使用平衡`BST`，如红黑树、`AVL`树等。

~~~java
public int reversePairs(int[] nums) {
    int res = 0;
    Node root = null;
    	
    for (int ele : nums) {
        res += search(root, 2L * ele + 1);
        root = insert(root, ele);
    }
    
    return res;
}
~~~

**2 二元索引树 解法**

对于`BIT`，搜索和插入操作应该是：

```java
private int search(int[] bit, int i) {
    int sum = 0;
    
    while (i < bit.length) {
        sum += bit[i];
        i += i & -i;
    }

    return sum;
}

private void insert(int[] bit, int i) {
    while (i > 0) {
        bit[i] += 1;
        i -= i & -i;
    }
}
```

注意：这里可能有些令人迷惑，因为原文作者的搜索和查找算法与传统的构造`BIT`算法是相反的，这是针对该问题进行的处理。按传统的`BIT`搜索插入算法，插入算法向上插入，搜索算法向下搜索，表示求到给定`index`的元素的频率和，而作者给出的算法恰恰相反，插入算法向下插入，搜索算法向上搜索，表示求大于给定`index`的元素的频率和。

主程序中仍然搜索不小于当前元素加1的两倍的所有元素（转换为长类型以避免溢出），同时将元素本身插入二元索引树。对于每个元素，使用`index()`函数获得在`BIT`树中的索引。不同于二元搜索树解法，该解法能够确保为$O(nlogn)$时间复杂度。

```java
public int reversePairs(int[] nums) {
    int res = 0;
    int[] copy = Arrays.copyOf(nums, nums.length);
    int[] bit = new int[copy.length + 1];
    
    Arrays.sort(copy);
    
    for (int ele : nums) {
        res += search(bit, index(copy, 2L * ele + 1));
        insert(bit, index(copy, ele));
    }
    
    return res;
}

private int index(int[] arr, long val) {
    int l = 0, r = arr.length - 1, m = 0;
     
    while (l <= r) {
    	m = l + ((r - l) >> 1);
    		
    	if (arr[m] >= val) {
    	    r = m - 1;
    	} else {
    	    l = m + 1;
    	}
    }
    
    return l + 1;
}
```

（我也按照传统方式实现了`BIT`的解法，如果您感兴趣，请查看[Java树状数组两种解法](https://leetcode-cn.com/problems/reverse-pairs/solution/javashu-zhuang-shu-zu-liang-chong-jie-fa-by-civita/)。）

**`II -- 分区递推关系`**

对于分区递推关系，设置`i = 0, j = n - 1, m = (n - 1) / 2`，我们有：

`T(0, n - 1) = T(0, m) + T(m + 1, n - 1) + C`

此时，子问题**C**既为：

**计算第一个元素来自左子数组`nums[0, m]`，第二个元素来自右子数组`nums[m + 1, n - 1]`时，重要翻转对的个数。**

对于该子问题，第一个条件显然也自动满足，对于第二个条件，我们当然也可以使用普通的线性搜索，对左子数组和右子数组进行遍历，但这仍然是$O(n^2)$时间复杂度，显然不是我们想要的解法。

幸运的是，我们明白对于该问题，数组的顺序无关紧要，这提示我们可以对两个子数组进行排序，如果两个子数组都已排序完成，那么可以使用两个指针在线性时间内获得全部的**重要翻转对**数目。

最后一个问题是：采取什么算法排序子数组。无论如何我们都需要将数组分为两半，因此我们自然会想到**归并排序**，同时，使用合并排序可以将搜索过程无缝嵌入到合并阶段中。

下面是基于归并排序的解法，`reversePairsSub`将返回子数组`nums[l, r]`的所有重要翻转对，双指针搜索算法嵌套在`while`循环之中。

```java
public int reversePairs(int[] nums) {
    return reversePairsSub(nums, 0, nums.length - 1);
}
    
private int reversePairsSub(int[] nums, int l, int r) {
    if (l >= r) return 0;
        
    int m = l + ((r - l) >> 1);
    int res = reversePairsSub(nums, l, m) + reversePairsSub(nums, m + 1, r);
        
    int i = l, j = m + 1, k = 0, p = m + 1;
    int[] merge = new int[r - l + 1];
        
    while (i <= m) {
        while (p <= r && nums[i] > 2 L * nums[p]) p++;
        res += p - (m + 1);
				
        while (j <= r && nums[i] >= nums[j]) merge[k++] = nums[j++];
        merge[k++] = nums[i++];
    }
        
    while (j <= r) merge[k++] = nums[j++];
        
    System.arraycopy(merge, 0, nums, l, merge.length);
        
    return res;
}
```

**`III -- 总结`**

本文介绍了求解数组问题的两种思路，希望能够增强您处理数组相关问题的技巧。



**译者注：英文水平一般，还请批评指正。**