package interview.face;

/**
 * Created by Paul on 9/25/15.
 */
public class Fibonacci {
    public static class Matrix2By2 {
        long m00;
        long m01;
        long m10;
        long m11;

        public Matrix2By2(long m00, long m01, long m10, long m11) {
            this.m00 = m00;
            this.m01 = m01;
            this.m10 = m10;
            this.m11 = m11;
        }
    }

    private static Matrix2By2 MatrixMultiply(Matrix2By2 m1, Matrix2By2 m2) {
        long m00 = m1.m00 * m2.m00 + m1.m01 * m2.m10;
        long m01 = m1.m00 * m2.m10 + m1.m01 * m2.m11;
        long m10 = m1.m10 * m2.m00 + m1.m11 * m2.m10;
        long m11 = m1.m10 * m2.m10 + m1.m11 * m2.m11;
        return new Matrix2By2(m00, m01, m10, m11);
    }

    private static Matrix2By2 MatrixPower(int n) {
        Matrix2By2 my = null;
        if(n == 1) {
            my = new Matrix2By2(1, 1, 1, 0);
        } else if( n % 2 == 0) {
            my = MatrixPower(n / 2);
            my = MatrixMultiply(my, my);
        } else if( n % 2 == 1) {
            my = MatrixPower((n - 1) / 2);
            my = MatrixMultiply(my, my);
            my = MatrixMultiply(my, new Matrix2By2(1, 1, 1, 0));
        }
        return my;
    }

    public static long FibonacciMatrix(int n) {
        if(n < 2) {
            return (long) n;
        }

        Matrix2By2 my = MatrixPower(n-1);
        return my.m00;
    }

    public static void main(String[] args) {
        long a = FibonacciMatrix(8);
    }
}
