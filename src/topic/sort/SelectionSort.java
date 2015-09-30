package topic.sort;

/**
 * Created by Paul on 9/27/15.
 */
public class SelectionSort {
    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = array[i];
            int pos = i;
            for(int j = i+1; j < array.length; j++) {
                if(array[j]<min) {
                    min = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = min;

        }
        for(int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        selectionSort(a);
    }
}
