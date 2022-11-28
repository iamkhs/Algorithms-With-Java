package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] data = { 20, 12, 10, 15, 2 };
        selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
    /*
    Selection sort is a sorting algorithm
    that selects the smallest element from an unsorted array
    and putting it at the beginning.
     */
    private static void selectionSort(int[] nums){
        int size = nums.length;
        for (int i = 0; i<size - 1; i++){
            int min = i;
            for (int j = i + 1; j<size; j++){
                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (nums[j] < nums[min]){
                    min = j;
                }
            }
            // put min at the correct position
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
}
