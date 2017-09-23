package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/nim-game/
 * answer link
 */
public class _292NimGame {
    public boolean canWinNim(int n) {
        return n % 4 != 0; // 要保证最后不是剩四个就可以赢
    }
}
