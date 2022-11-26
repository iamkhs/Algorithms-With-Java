package searching_algorithms.linear_search;

public class LinearSearch {
    public static void main(String[] args){
        /*
        Linear Search is defined as a sequential search algorithm
        that starts at from first index element and goes through each element of a list
        until the target element is found,
        otherwise the search continues till the end of the data set (index).
        It is the easiest searching algorithm
        */

        int[] nums = {32,56,13,89,54,44,98};
        int target = 89;
        int ans = linearSearch3(nums, target);
        System.out.println(ans);

    }

    // returning the index of target element
    private static int linearSearch3(int[] nums, int target){
        for (int i =0; i< nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    // checking the target element is found or not
    private static boolean linearSearch2(int [] nums, int target){
        for (int i : nums){
            if (i == target){
                return true;
            }
        }
        return false;
    }
    // returning the target element
    private static int linearSearch(int [] nums, int target){
        for (int i : nums){
            if (i == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
