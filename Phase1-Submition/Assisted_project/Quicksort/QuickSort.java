package Assistepractise;

public class QuickSort {
	public static int partition(final int[] arr, final int low, final int high) {
        final int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; ++j) {
            if (arr[j] < pivot) {
                ++i;
                final int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        ++i;
        final int temp2 = arr[i];
        arr[i] = pivot;
        arr[high] = temp2;
        return i;
    }
    
    public static void quickSort(final int[] arr, final int low, final int high) {
        if (low < high) {
            final int pivotindex = partition(arr, low, high);
            quickSort(arr, low, pivotindex - 1);
            quickSort(arr, pivotindex + 1, high);
        }
    }
    
    public static void main(final String[] args) {
        final int[] arr = { 90, 50, 4, 70, 3, 15 };
        final int n = arr.length;
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.println(arr[i]);
        }
    }

}
