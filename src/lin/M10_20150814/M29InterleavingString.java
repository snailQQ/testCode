package lin.M10_20150814;

import java.util.ArrayList;

/**
 * Created by Paul on 8/13/15.
 */
//Interleaving String
//
//        26% Accepted
//        Given three strings: s1, s2, s3, determine whether s3 is formed by the interleaving of s1 and s2.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For s1 = "aabcc", s2 = "dbbca"
//
//        When s3 = "aadbbcbcac", return true.
//        When s3 = "aadbbbaccc", return false.
//        Challenge
//        O(n2) time or better
//
//        Tags Expand
public class M29InterleavingString {
    /**
     * Determine whether s3 is formed by interleaving of s1 and s2.
     * @param s1, s2, s3: As description.
     * @return: true or false.
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        // write your code here
        if(s3.length() != s1.length() + s2.length()) {
            return false;
        }

        int[][] mapper = new int[s1.length()+1][s2.length()+1];

        int s1Pos = 0;
        int s2Pos = 0;
        for(int i = 0; i < s3.length(); i++) {
            if(s3.charAt(i) == s1.charAt(s1Pos)) {
                if(s2Pos == 0) {
                    mapper[s1Pos+1][0] = 1;
                }else {
                    mapper[s1Pos+1][s2Pos] = mapper[s1Pos+1][s2Pos-1] + mapper[s1Pos][s2Pos];
                }
                s1Pos++;
            }
            if(s3.charAt(i) == s2.charAt(s2Pos)) {
                if(s1Pos == 0) {
                    mapper[0][s2Pos+1] = 1;
                }else {
                    mapper[s1Pos][s2Pos+1] = mapper[s1Pos][s2Pos] + mapper[s1Pos-1][s2Pos+1];
                }
                s2Pos++;
            }
        }

//        for(int i = 1; i <= s1.length(); i++) {
//           if(s1.charAt(i-1) == s3.charAt(i-1)) {
//               mapper[0][i] = 1;
//           }
//        }
//
//        for(int i = 1; i <= s2.length(); i++) {
//            if(s2.charAt(i-1) == s3.charAt(i-1)) {
//                mapper[i][0] = 1;
//            }
//        }



//        for(int i = 0; i <= s1.length(); i++){
//            for(int j = 0; j <= s2.length(); j++) {
//                if(s1.charAt(i) == s3.charAt(S3Position)){
//                    if(j==0) {
//                        mapper[i][j+1] = 1;
//                    }else {
//                        mapper[i][j+1] = mapper[i][j] + mapper[i-1][j+1];
//                    }
//                    S3Position++;
//                }
//                if(s2.charAt(j) == s3.charAt(S3Position)){
//                    if(i==0) {
//                        mapper[i+1][j] = 1;
//                    }else {
//                        mapper[i+1][j] = mapper[i][j] + mapper[i+1][j-1];
//                    }
//                    S3Position++;
//                }
//            }
//        }

        for(int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                System.out.print(" "+ mapper[i][j]);
            }
            System.out.println();
        }
//        int s1pos = 0;
//        int s2pos = 0;
//        int mapperX = 0;
//        int mapperY = 0;
//        for(int i = 0; i < s3.length(); i++) {
//            if(s3.charAt(i) == s1.charAt(s1pos)) {
//                mapper[mapperX][++mapperY] = true;
//                s1pos++;
//            }
//            if(s3.charAt(i) == s2.charAt(s2pos)) {
//                mapper[++mapperX][mapperY] = true;
//                s2pos++;
//            }
//        }
        return true;
    }

    public static void main(String [] args) {
//        For s1 = "aabcc", s2 = "dbbca"
//
//        When s3 = "aadbbcbcac"

        boolean a = isInterleave("aabcc", "dbbca", "aadbbcbcac");
    }
}
//if(s3.length()!=s1.length()+s2.length())
//        return false;
//
//        boolean [][] dp = new boolean [s1.length()+1][s2.length()+1];
//        dp[0][0]=true;
//
//        for(int i = 1; i<=s1.length() && s1.charAt(i-1)==s3.charAt(i-1); i++)
//        dp[i][0]=true;
//
//        for(int i = 1; i<=s2.length() && s2.charAt(i-1)==s3.charAt(i-1); i++)
//        dp[0][i]=true;
//
//        for(int i = 1; i <= s1.length(); i++){
//            for(int j = 1; j <= s2.length(); j++){
//                char c = s3.charAt(i+j-1);
//                if(c == s1.charAt(i-1) && dp[i-1][j])
//                dp[i][j] = true;
//
//                if(c == s2.charAt(j-1) && dp[i][j-1])
//                dp[i][j] = true;
//            }
//        }
//        return dp[s1.length()][s2.length()];