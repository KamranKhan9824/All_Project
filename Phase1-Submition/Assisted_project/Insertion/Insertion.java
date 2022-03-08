package Assistepractise;

public class Insertion {

	public static void InsertionSort(final int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int current;
            int j;
            for (current = arr[i], j = i - 1; j >= 0 && current < arr[j]; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = current;
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
        InsertionSort(arr);
        System.out.println("Array After sorting");
        int[] array2;
        for (int length2 = (array2 = arr).length, j = 0; j < length2; ++j) {
            final int element = array2[j];
            System.out.println(element);
        }
    }
}
