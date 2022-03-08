package Assistepractise;

import java.util.Arrays;

public class ExpoSearch {

	public static void main(final String[] args) {
        final int[] arr = { 5, 6, 18, 24, 32 };
        final int length = arr.length;
        final int value = 18;
        final int outcome = exponentialSearch(arr, length, value);
        if (outcome < 0) {
            System.out.println("Element is not present in the array");
        }
        else {
            System.out.println("Element is  present in the array at index :" + outcome);
        }
    }
    
    public static int exponentialSearch(final int[] arr, final int length, final int value) {
        if (arr[0] == value) {
            return 0;
        }
        int i;
        for (i = 1; i < length && arr[i] <= value; i *= 2) {}
        return Arrays.binarySearch(arr, i / 2, Math.min(i, length), value);
    }

}
