package Assistepractise;
import java.util.*;

public class BinarySearch {

    public static int binary(final int[] arr, final int last, final int first, final int key) {
        if (last < first) {
            return -1;
        }
        final int mid = first + (last - first) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[mid] > key) {
            return binary(arr, first, mid - 1, key);
        }
        return binary(arr, mid + 1, last, key);
    }
    
    public static void main(final String[] args) {
        final int[] arr = { 2, 4, 6, 1, 50, 9, 65, 46 };
        final Scanner sc = new Scanner(System.in);
        int[] array;
        for (int length = (array = arr).length, j = 0; j < length; ++j) {
            final int element = array[j];
            System.out.println(element);
        }
        System.out.println("Enter the key to be searched");
        final int key = sc.nextInt();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                System.out.println("Found at position:-" + i);
            }
        }
    }

}
