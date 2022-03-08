package Assistepractise;

public class MergeSort {

	 public static void Divide(final int[] arr, final int si, final int ei) {
	        final int mid = si + (ei - si) / 2;
	        if (si >= ei) {
	            return;
	        }
	        Divide(arr, si, mid);
	        Divide(arr, mid + 1, ei);
	        Merge(arr, si, mid, ei);
	    }
	    
	    public static void Merge(final int[] arr, final int si, final int mid, final int ei) {
	        int id1 = si;
	        int id2 = mid + 1;
	        final int[] Conquer = new int[ei - si + 1];
	        int k = 0;
	        while (id1 <= mid) {
	            if (id2 > ei) {
	                break;
	            }
	            if (arr[id1] <= arr[id2]) {
	                Conquer[k] = arr[id1];
	                ++k;
	                ++id1;
	            }
	            else {
	                Conquer[k] = arr[id2];
	                ++k;
	                ++id2;
	            }
	        }
	        while (id1 <= mid) {
	            Conquer[k] = arr[id1];
	            ++k;
	            ++id1;
	        }
	        while (id2 <= ei) {
	            Conquer[k] = arr[id2];
	            ++k;
	            ++id2;
	        }
	        for (int i = 0, j = si; i < Conquer.length; ++i, ++j) {
	            arr[j] = Conquer[i];
	        }
	    }
	    
	    public static void main(final String[] args) {
	        final int[] arr = { 50, 4, 2, 15, 3, 1, 9 };
	        Divide(arr, 0, arr.length - 1);
	        int[] array;
	        for (int length = (array = arr).length, i = 0; i < length; ++i) {
	            final int element = array[i];
	            System.out.println(element);
	        }
	    }
}
