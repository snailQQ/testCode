package test;

/**
 * Created by pengcheng.qi on 9/20/17.
 */
public class FindNumber {
  public static int findNumberByPosition(int position) {
    int[] sum = new int[position];
    sum[0] = 1;
    sum[1] = 1989;

    for(int i = 2; i < position; i++) {
      sum[i] = Math.max((sum[i-1]-sum[i-2]), (sum[i-2]-sum[i-1]));
      System.out.println(i + " " + sum[i]);
    }

    return sum[position-1];
  }

  public static void main(String[] args) {
    int result = findNumberByPosition(1989);
    System.out.println(result);
  }

}
