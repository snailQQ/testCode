package leetcode.leetcode.to240;

/**
 * Created by Paul on 11/17/15.
 * question link
 * <p/>https://leetcode.com/problems/rectangle-area/
 * answer link
 * http://www.programcreek.com/2014/06/leetcode-rectangle-area-java/
 */
public class _223RectangleArea {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        if(A >= G || B >= H || E >= C || F >= D) {
            return (C - A) * (D - B) + (G - E) * (H - F);
        }
        int x1 = Math.max(A, E);
        int x2 = Math.min(C, G);

        int y1 = Math.max(B, F);
        int y2 = Math.min(D, H);

        return (C - A) * (D - B) + (G - E) * (H - F) - Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
}
