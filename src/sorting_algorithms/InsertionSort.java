package sorting_algorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2,};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

     /*
    Insertion sort is a simple sorting algorithm
    that works similar to the way you sort playing cards in your hands.
    The array is virtually split into a sorted and an unsorted part.
    Values from the unsorted part are picked and
    placed at the correct position in the sorted part.
     */

    private static void insertionSort(int[] arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j>0; j--){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
    }

    // another method of insertion sort
    private static void insertionSort2(int[] arr){
        for (int i = 1; i<arr.length; i++){
            int item = arr[i];

            int j = i-1;
            while (j >=0 && item < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }
}
