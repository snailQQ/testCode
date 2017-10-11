//package lin.New20170924;
//
///**
// * Created by pengcheng.qi on 9/24/17.
// */
//public class Lin397LongestIncreasingContinuousSubsequence {
//  int LIS(int[] A) {
//    int n = A.length;
//    int[] f = new int[n];
//    int i, res = 0;
//    for (i = 0; i < n; ++i) {
//      f[i] = 1;
//      if (i > 0 && A[i-1] < A[i]) {
//        f[i] = f[i-1] + 1;
//      }
//      if (f[i] > res) {
//        res = f[i];
//      }
//    }
//
//    return res;
//  }
//
//  int LIS2(int[] A) {
//    int i, j;
//    int[] f = new int[A.length];
//    int res = 0;
//    for(i = 0; i < n; i++) {
//      f[i] = 1;
//      if(i > 0 && A[i] > A[i-1]) {
//        f[i] = f[i-1] + 1;
//      }
//      res = Math.max(res, f[i]);
//    }
//
//    return res;
//  }
//
//  public int longestIncreasingContinuousSubsequence2(int[] A) {
//    int n = A.length;
//    if(n == 0) {
//      return 0;
//    }
//
//
//    int r1 = LIS2(A);
//    int i, j, t;
//    i = 0;
//    j = n -1;
//    while(i < j) {
//      t = A[i];
//      A[i] = A[j];
//      A[j] = t;
//      ++i;
//      ++j;
//    }
//    int r2 = LIS2(A);
//    return r1 > r2? r1:r2;
//  }
//
//  public int longestIncreasingContinuousSubsequence(int[] A) {
//    int n = A.length;
//    int r1 = LIS(A);
//    int i = 0, j = n-1, t;
//    while (i < j) {
//      t = A[i];
//      A[i] = A[j];
//      A[j] = t;
//      ++i;
//      --j;
//    }
//
//    int r2 = LIS(A);
//
//    if (r1 > r2) {
//      return r1;
//    }
//    else {
//      return r2;
//    }
//  }
//}
//
//
