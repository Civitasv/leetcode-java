package main;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {

    /**
     * In a deck of cards, every card has a unique integer.  You can order the deck in any order you want.
     *
     * Initially, all the cards start face down (unrevealed) in one deck.
     *
     * Now, you do the following steps repeatedly, until all cards are revealed:
     *
     * 1. Take the top card of the deck, reveal it, and take it out of the deck.
     * 2. If there are still cards in the deck, put the next top card of the deck at the bottom of the deck.
     * 3. If there are still unrevealed cards, go back to step 1.  Otherwise, stop.
     * Return an ordering of the deck that would reveal the cards in increasing order.
     *
     * @param deck 牌的初始顺序
     * @return 返回一个顺序，使得其可以按照从小到大观察牌
     */
    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Queue<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card: deck) {
            ans[index.poll()] = card;
            if (!index.isEmpty())
                index.add(index.poll());
        }

        return ans;
    }
}
