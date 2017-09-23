package leetcode.leetcode.to200;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/compare-version-numbers/
 * answer link
 */
public class _165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        if(version1 == null || version1.length() == 0 || version2 == null || version2.length() == 0) {
            return 0;
        }
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int i = 0;
        while(i < s1.length || i < s2.length) {
            if(i < s1.length && i < s2.length) {
                long v1 = Long.parseLong(s1[i]);
                long v2 = Long.parseLong(s2[i]);
                if(v1 > v2) {
                    return 1;
                } else if(v1 < v2) {
                    return -1;
                }
            } else if(i < s1.length) {
                if(Long.parseLong(s1[i]) != 0) {
                    return 1;
                }
            } else {
                if(Long.parseLong(s2[i]) != 0) {
                    return -1;
                }
            }
            i++;
        }
        return 0;
    }
}
