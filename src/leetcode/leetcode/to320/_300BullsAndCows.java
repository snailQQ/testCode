package leetcode.leetcode.to320;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>
 * answer link
 */
public class _300BullsAndCows {
    public String getHint(String secret, String guess) {
        if(secret == null || guess == null) {
            return null;
        }

        int[] number = new int[10];
        for(int i = 0; i < secret.length(); i++) {
            int n = secret.charAt(i) - '0';
            number[n] += 1;
        }

        int cows = 0;
        for(int i = 0; i < guess.length(); i++) {
            int n = guess.charAt(i) - '0';
            if(number[n] > 0) {
                cows++;
            }
            number[n] -= 1;
        }

        int bulls = 0;
        for(int i = 0; i < secret.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                cows--;
            }
        }
        return bulls + "A" + cows + "B";
    }
}
