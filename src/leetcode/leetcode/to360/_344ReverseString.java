package leetcode.leetcode.to360;

/**
 * Created by SNAILQQ on 10/30/17.
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class _344ReverseString {
  public static String reverseString(String s) {
    if(s == null || s.length() <= 1) {
      return s;
    }

    char[] chars = s.toCharArray();

    int left = 0;
    int right = s.length() - 1;
    while(left < right) {
      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      left++;
      right--;
    }

    String result = new String(chars);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(reverseString("hello"));
  }
}
