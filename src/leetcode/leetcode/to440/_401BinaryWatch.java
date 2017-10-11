package leetcode.leetcode.to440;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengcheng.qi on 10/9/17.
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

 Each LED represents a zero or one, with the least significant bit on the right.


 For example, the above binary watch reads "3:25".

 Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

 Example:

 Input: n = 1
 Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 Note:
 The order of output does not matter.
 The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class _401BinaryWatch {
  public static List<String> readBinaryWatch(int num) {
    int[] nums = new int[]{100,200,400,800,1,2,4,8,16,32};
    List<String> result = new ArrayList<String>();
    if(num <= 0) {
      result.add("0:00");
      return result;
    }

    helper(result, nums, num, 0, 0);

    return result;
  }

  private static void helper(List<String> result, int[] nums, int count, int pos, int sum) {
    if(count == 0) {
      String element = sum / 100 + ":";
      int min =  sum % 100;
      if(min == 0) {
        element += "00";
      } else if(min < 10){
        element = element + "0" + min;
      } else{
        element += min;
      }
      result.add(element);
    }

    for(int i = pos; i < nums.length; i++) {
      if(sum + nums[i] >= 1200 || (sum + nums[i]) % 100 >= 60) {
        continue;
      }
      helper(result, nums, count-1, i+1, sum + nums[i]);

    }
  }

  public static void main(String[] args) {
    List<String> result = new ArrayList<String>();
    result = readBinaryWatch(2);
    for(int i = 0; i < result.size(); i++) {
      System.out.println((i+1)+": "+result.get(i));
    }
  }
}
