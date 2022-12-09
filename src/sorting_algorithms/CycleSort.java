package sorting_algorithms;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] nums = {3, 5 ,2, 1, 4};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    /*
    Cycle sort is an algorithm for sorting a list of items
    in which each element is a certain number of positions away from
    its correct position in the sorted list. The algorithm works by
    iterating through the list and moving each element to its correct position,
    one at a time, until the entire list is sorted. This is done by starting at the first element, a
    nd then moving through the list in a "cyclical" manner,
    swapping each element with the element that is currently in its correct position.
    The result is a list of elements that are sorted in ascending order.
     */

    // This method sorts the given array using the cycle sort algorithm
    private static void cycleSort(int[] arr) {
        // Initialize the index variable to zero
        int i = 0;
        // While the index is less than the length of the array
        while (i < arr.length) {
            // Get the current element in the array
            int current = arr[i] - 1;
            // If the current element is not in its correct position
            if (arr[i] != arr[current]) {
                // Swap the current element with the element in its correct position
                int temp = arr[i];
                arr[i] = arr[current];
                arr[current] = temp;
            }
            // Otherwise, if the current element is already in its correct position
            else {
                // Move to the next element in the array
                i++;
            }
        }
    }
}
