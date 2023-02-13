package searching_algorithms.binary_search;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] nums = {12, 22, 34, 38, 45, 73, 81, 93};
        int target = 73;
        int ans = binarySearch(nums, target, 0, nums.length-1);
        System.out.println(ans);
    }
    // Binary Search using Recursion
    private static int binarySearch(int[] nums, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (target == nums[mid]){
            return mid;
        }

        if (target > nums[mid]){
            return binarySearch(nums, target, mid + 1, end);
        }

        return binarySearch(nums, target, start, nums.length - 1);
    }
}
