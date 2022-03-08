package Assistepractise;

public class SelectionSort {

	public static void SelectionSort(final int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            final int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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
        SelectionSort(arr);
        System.out.println("Array After sorting");
        int[] array2;
        for (int length2 = (array2 = arr).length, j = 0; j < length2; ++j) {
            final int element = array2[j];
            System.out.println(element);
        }
    }

}
