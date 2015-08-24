package lin.M17_20150822;

/**
 * Created by Paul on 8/22/15.
 */
//Sort Letters by Case
//
//        37% Accepted
//        Given a string which contains only letters. Sort it by lower case first and upper case second.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For "abAcD", a reasonable answer is "acbAD"
//
//        Note
//        It's not necessary to keep the original order of lower-case letters and upper case letters.
//
//        Challenge
//        Do it in one-pass and in-place.
public class M49SortLettersByCase {
    /**
     *@param chars: The letter array you should sort by Case
     *@return: void
     */
    public static void sortLetters(char[] chars) {
        //write your code here
        int start = 0;
        int end = chars.length - 1;
        int i = 0;
        while (start < end) {
//            while (start < end && isLowerCase(chars[start])) {
//                start++;
//            }
//            while (end > start && !isLowerCase(chars[end])) {
//                end--;
//            }
//            char tmp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = tmp;
//            start++;
//            end--;
            if(isLowerCase(chars[i])) {
                start++;
                i++;
            }else if(!isLowerCase(chars[i])) {
                swap(chars, i, end);
                end--;
            }
        }
        System.out.println(start);
    }

    private static void swap(char[] a, int i, int j){
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    public static void main(String [] args) {
        char[] a = {'a','b','A','c','D'};
        sortLetters(a);
    }
}
