package searching_algorithms.binary_search;

public class Binary_Search {
    public static void main(String[] args){
        int[] nums = {12, 22, 34, 38, 45, 73, 81, 93};
        int target = 73;
        int ans = search(nums, target, 0, nums.length-1);
        System.out.println(ans);
    }
    /*
    Binary Search is a searching algorithm used in a sorted array
    by repeatedly dividing the search interval in half.
    The idea of binary search is to use the information that the array is sorted and
    reduce the time complexity to O(Log n).

    Binary search is faster than linear search.
     */
    private static int binarySearch(int [] nums, int target){

        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if (target > nums[mid]){
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    // Binary Search using Recursion
    private static int search(int[] nums, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]){
            return mid;
        }

        if (target > nums[mid]){
            return search(nums, target, mid + 1, end);
        }

        return search(nums, target, start, nums.length - 1);
    }
}
