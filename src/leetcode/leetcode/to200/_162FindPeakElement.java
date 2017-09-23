package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/find-peak-element/
 * answer link
 */
public class _162FindPeakElement {
    public static  int findPeakElement(int[] num) {

        int length = num.length;
        int left = 0;
        int right = length-1;

        int a=0;
        while(left<=right){   //左右开工找peak，直到两个element重合为止
            if(left==right){
                a = left;
                break;
            }
            int mid = (left+right)/2;

            if(num[mid]<num[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }

        }
        return a;
    }

    public static void main(String[] args) {
        int a = findPeakElement(new int[]{1,2,10,4,5,9,7});
    }
}
