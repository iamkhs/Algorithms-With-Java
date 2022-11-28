package sorting_algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {18,14,12,15,11,9,16};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    Bubble sort is a sorting algorithm that
    compares each pair of adjacent elements and swaps them
    until they are in the intended order.
    Just like the movement of air bubbles in the water
    that rise up to the surface, each element of the array move to the end in each iteration.
    Therefore, it is called a bubble sort.
    This algorithm is not suitable for large data sets as
    its average and worst case complexity are of Ο(n2) where n is the number of items.
     */
    private static void bubbleSort(int[] arr){
        // run the steps n-1 times
        boolean swapped = false;
        for (int i = 0; i<arr.length; i++){
            // for each step, max item will come at the last respective index
            for (int j = 1; j<arr.length - i; j++){
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            // hence stop the program
            if (!swapped){
                break;
            }
        }
    }
}
