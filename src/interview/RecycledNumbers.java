package interview;

import java.util.HashSet;

public class RecycledNumbers {
    public static int findNumberOfPairs(int A, int B) {
        int res = 0;
        int len = ("" + A).length();
        int count = len-1;
        char c2 = ("" + B).charAt(0);
        System.out.println("A : " + A + " B : " + B);
            
        for(int i=A;i<=B;i++) {
            HashSet<Integer> partnerSet = new HashSet<Integer>();
            String input = "" + i;
            char c1 = input.charAt(0);
            
            for(int j=0;j<count;j++) {
                String prefix = input.substring(count-j);
                char c = prefix.charAt(0);
                if(c < c1 || c > c2) {
                    continue;
                }
                int partner = Integer.parseInt(prefix + input.substring(0, count-j));
                if(!partnerSet.contains(partner) && partner > i && partner <= B && ("" + partner).length() == len) {
                    System.out.println("Partner Found : " + i +" " + partner);
                    res++;
                    partnerSet.add(partner);
                }
            }
        }
        
        System.out.println("Num of pairs : " + res);
        
        return res;
//    	if(B <= A) {
//    		return 0;
//    	}
//    	int rst = 0;
//    	String strA = Integer.toString(A);
//    	String strB = Integer.toString(B);
//    	int lenA = strA.length();
//    	for(int i = A; i <= B; i++) {
//    		HashSet<Integer> hs = new HashSet<Integer>();
//    		String number = Integer.toString(i);
//    		char firstOfI = number.charAt(0);
//    		for(int j = 0; j < lenA-1; j++) {
//    			String prefix = number.substring(lenA-1-j);
//    			char firstOfP = prefix.charAt(0);
//    			if(firstOfP < firstOfI || firstOfP > strB.charAt(0)) {
//    				continue;
//    			}
//        		int newNumber = Integer.parseInt(prefix + number.substring(0,  lenA-1-j));
//        		if(!hs.contains(newNumber) && newNumber > i && newNumber <= B && Integer.toString(newNumber).length() == lenA) {
//        			rst++;
//        			System.out.println("Partner Found : " + i +" " + newNumber102);
//        			hs.add(newNumber);
//        		}
//    		}
//    	}
//    	System.out.println("Num of pairs : " + rst);
//    	return rst;
    }
    
    public static void main(String[] args) {
		int a = findNumberOfPairs(100, 999);
	}
}
