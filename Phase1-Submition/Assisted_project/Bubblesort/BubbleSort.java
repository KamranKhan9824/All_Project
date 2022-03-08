package Assistepractise;

public class BubbleSort {

	public static void BubbleSort(final int[] arr) {
        for (int n = arr.length, i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    final int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(final String[] args) {
        final int[] arr = { 90, 5, 6, 23, 1, 15, 2 };
        System.out.println("Array before sorting");
        int[] array;
        for (int length = (array = arr).length, i = 0; i < length; ++i) {
            final int element = array[i];
            System.out.println(element);
        }
        BubbleSort(arr);
        System.out.println("Array After sorting");
        int[] array2;
        for (int length2 = (array2 = arr).length, j = 0; j < length2; ++j) {
            final int element = array2[j];
            System.out.println(element);
        }
    }

}
