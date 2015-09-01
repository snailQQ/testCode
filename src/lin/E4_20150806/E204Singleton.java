package lin.E4_20150806;

/**
 * Created by Paul on 8/5/15.
 * http://www.lintcode.com/en/problem/singleton/
 */
//Singleton
//
//        35% Accepted
//        Singleton is a most widely used design pattern. If a class has and only has one instance at every moment, we call this design as singleton. For example, for class Mouse (not a animal mouse), we should design it in singleton.
//
//        You job is to implement a getInstance method for given class, return the same instance of this class every time you call this method.
//
//        Have you met this question in a real interview? Yes
//        Example
//        In Java:
//
//        A a = A.getInstance();
//        A b = A.getInstance();
//        a should equal to b.
//
//        Challenge
//        If we call getInstance concurrently, can you make sure your code could run correctly?
public class E204Singleton {
    /**
     * @return: The same instance of this class every time
     */
    private static E204Singleton ins = null;
    public static E204Singleton getInstance() {
        // write your code here
        if (ins == null) {
            ins = new E204Singleton();
        }
        return ins;
    }
}
