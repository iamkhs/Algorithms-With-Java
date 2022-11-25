package searching_algorithms.binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args){

        int[] nums = {93,89,81,75,68,53,47,32}; // Descending sorted array
//        int[] nums = {12, 22, 34, 38, 45, 75, 81, 93}; // Ascending sorted array
        int target = 75;
        int ans = orderAgnosticBS(nums, target);
        System.out.println(ans);

    }

    private static int orderAgnosticBS(int[] nums, int target){

        int start = 0;
        int end = nums.length - 1;

        // checking the array is sorted in ascending or descending
        boolean isAsc = nums[start] < nums[end];

        while(start <= end){

            int mid = (start + end) / 2;
            if (nums[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target > nums[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else{
                if (target > nums[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
