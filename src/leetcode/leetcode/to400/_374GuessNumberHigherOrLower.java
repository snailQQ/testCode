package leetcode.leetcode.to400;

/**
 * Created by SNAILQQ on 10/27/17.
 *
 * We are playing the Guess Game. The game is as follows:

 I pick a number from 1 to n. You have to guess which number I picked.

 Every time you guess wrong, I'll tell you whether the number is higher or lower.

 You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

 -1 : My number is lower
 1 : My number is higher
 0 : Congrats! You got it!
 Example:
 n = 10, I pick 6.

 Return 6.
 */
public class _374GuessNumberHigherOrLower {

//  public int guessNumber(int n) {
//
//    int start = 1;
//    int end = n;
//    while(start + 1 < end) {
//      int mid = start + (end - start) / 2;
//      int guessNum = guess(mid);
//      if(guessNum == 0) {
//        return mid;
//      } else if(guessNum == -1) {
//        end = mid;
//      } else {
//        start = mid;
//      }
//    }
//
//    if(guess(start) == 0) {
//      return start;
//    }
//    if(guess(end) == 0) {
//      return end;
//    }
//    return -1;
//  }

}
