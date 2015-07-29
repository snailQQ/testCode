package lin;

/**
 * Created by Paul on 7/27/15.
 */
//
//Add Binary
//
//        23% Accepted
//        Given two binary strings, return their sum (also a binary string).
//
//        Example
//        a = 11
//
//        b = 1
//
//        Return 100
public class E408AddBinary {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public static String addBinary(String a, String b) {
        // Write your code here
//        String input0 = "1010";
//        String input1 = "10";

        // Use as radix 2 because it's binary
        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);

        int sum = number0 + number1;

        return String.valueOf(Integer.toBinaryString(sum));
    }

    public static String addBinary2(String a, String b) {
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }

        int pa = a.length()-1;
        int pb = b.length()-1;
        int carries = 0;
        String rst = "";

        while(pb >= 0){
            int sum = (int)(a.charAt(pa) - '0') + (int)(b.charAt(pb) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
            pb --;
        }

        while(pa >= 0){
            int sum = (int)(a.charAt(pa) - '0') + carries;
            rst = String.valueOf(sum % 2) + rst;
            carries = sum / 2;
            pa --;
        }

        if (carries == 1)
            rst = "1" + rst;
        return rst;
    }

    public static void main(String [] args) {
        String a = "11";
        String b = "1";
        String sum = addBinary2(a, b);
        System.out.println(sum);

    }


}
