package topic.sort;

/**
 * Created by Paul on 9/27/15.
 */
public class InsertionSort {
    public static void insertionSort(int[] array) {
        if(array == null || array.length == 0) {
            return;
        }
        for(int i = 1; i < array.length; i++) {
            int j;
            int temp = array[i];
            for(j = i-1; j>=0 && array[j] > temp; j--) {
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }

        for(int i : array) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        insertionSort(a);
    }
}
