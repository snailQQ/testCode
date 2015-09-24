//package lin.M14_20150819;
//
///**
// * Created by Paul on 8/19/15.
// */
////Permutation Sequence
////
////        26% Accepted
////        Given n and k, return the k-th permutation sequence.
////
////        Have you met this question in a real interview? Yes
////        Example
////        For n = 3, all permutations are listed as follows:
////
////        "123"
////        "132"
////        "213"
////        "231"
////        "312"
////        "321"
////        If k = 4, the fourth permutation is "231"
////
////        Note
////        n will be between 1 and 9 inclusive.
////
////        Challenge
////        O(n*k) in time complexity is easy, can you do it in O(n^2) or less?
//public class M388PermutationSequence {
//    /**
//     * @param n: n
//     * @param k: the kth permutation
//     * @return: return the k-th permutation
//     */
//    public String getPermutation(int n, int k) {
//        String rst = "";
//        if(n <= 0) {
//            return rst;
//        }
//
//        int[] array = new int[n];
//        for(int i = 0; i < n; i++) {
//            array[i] = i+1;
//        }
//
////        if(k == 1) {
////            return array2String(array);
////        }
//
//        int index = 1;
//        helper(array, index, k);
//
//
//    }
//
//    private String array2String(int[] array) {
//        String string = "";
//        for(int i = 0; i < array.length; i++) {
//            string += Integer.toString(i);
//        }
//        return string;
//    }
//
//    private void helper(int[] array, int index, int k) {
//        if(index == k) {
//            return array;
//        }
//    }
//}
