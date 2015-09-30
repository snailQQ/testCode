package topic.sort;

/**
 * Created by Paul on 9/27/15.
 */
public class QuickSort {
    public static void quickSort(int[] array) {
        qsRecursive(array, 0, array.length-1);
        for(int i : array) {
            System.out.println(i);
        }
    }

    private static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private static void qsRecursive(int[] array, int start, int end) {
        if(start >= end) {
            return;
        }
        int pivot = array[start];
        int left = start;
        int right = end;
        while(left < right) {
            while(left < right && array[right] >= pivot) {
                right--;
            }
            if(left < right) {
                swap(array, left++, right);
            }
            while(left < right && array[left] < pivot) {
                left++;
            }
            if(left < right) {
                swap(array, right--, left);
            }

        }
        qsRecursive(array, start, left-1);
        qsRecursive(array, left+1, end);
    }

    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        quickSort(a);
    }
}
