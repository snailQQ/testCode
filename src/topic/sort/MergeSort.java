package topic.sort;

/**
 * Created by Paul on 9/27/15.
 */
public class MergeSort {
    public static void mergeSort(int[] array) {

        sort(array, 0, array.length-1);
        for(int i : array) {
            System.out.println(i);
        }
    }

    private static void sort(int[] array, int left, int right) {
        int mid = left + (right - left) / 2;
        if(left < right) {
            sort(array, left, mid);
            sort(array, mid+1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int l = left;
        int r = mid + 1;
        int index = 0;
        while( l <= mid && r <= right) {
            if (array[l] < array[r]) {
                temp[index++] = array[l++];
            } else {
                temp[index++] = array[r++];
            }
        }

        while (l <= mid) {
            temp[index++] = array[l++];
        }

        // 把右边数组剩余的元素复制到临时数组中
        while (r <= right) {
            temp[index++] = array[r++];
        }

        // 将临时数组中的元素复制到原来的数组中
        for (int i = 0; i < temp.length; i++) {
            array[i + left] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {6,5,3,1,8,7,2,4};
        mergeSort(a);
    }
}
