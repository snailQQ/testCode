package leetcode;

/**
 * Created by Paul on 10/3/15.
 */
public class LeetMVerifyPreorderBST255 {
    public static boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 1) {
            return true;
        }

        int i = -1;
        int max = Integer.MIN_VALUE;

        for (int num : preorder) {
            if (num < max) {
                return false;
            }

            while (i >= 0 && num > preorder[i]) {
                max = preorder[i];
                i--;
            }

            i++;
            preorder[i] = num;
        }

        return true;
    }

    public static void main(String[] args) {
        boolean a = verifyPreorder(new int[]{5,3,2,4,8,6,9});
    }
}
