package test;


import main.GetEqualSubstringsWithinBudget;
import org.junit.jupiter.api.Test;

class GetEqualSubstringsWithinBudgetTest {

    @Test
    void test() {
        GetEqualSubstringsWithinBudget budget = new GetEqualSubstringsWithinBudget();
        System.out.println(budget.equalSubstring("abcd", "bcdf", 3));
    }
}