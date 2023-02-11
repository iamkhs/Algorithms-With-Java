package sorting_algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};

        // Divide the array into subarrays
        divide(arr, 0, arr.length);
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Time Complexity of Merge Sort is O(nlogN)

    private static void divide(int[] arr, int start, int end){
        // If the end index minus the start index is 1, return
        if (end - start == 1){
            return;
        }

        // Calculate the middle index
        int mid = start + (end - start) / 2;
        // Divide the array into two subarrays
        divide(arr, start, mid);
        divide(arr, mid, end);

        // Merge the subarrays
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end){
        // Create a temporary array for the sorted subarray
        int[] sortedArray = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        // Compare the values in the subarrays and add the smaller value to the sorted array
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                sortedArray[k++] = arr[i++];
            } else {
                sortedArray[k++] = arr[j++];
            }
        }

        // Add any remaining values in the left subarray to the sorted array
        while (i < mid) {
            sortedArray[k++] = arr[i++];
        }

        // Add any remaining values in the right subarray to the sorted array
        while (j < end) {
            sortedArray[k++] = arr[j++];
        }

        // Copy the values from the sorted array back to the original array
        for (int l = 0; l < sortedArray.length; l++) {
            arr[start + l] = sortedArray[l];
        }
    }
}
