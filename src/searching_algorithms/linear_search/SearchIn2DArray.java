package searching_algorithms.linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int [][] nums = {
                {12,33,76,98,23},
                {23,68,75},
                {82,89,8,17},
                {79,59}
        };

        int target = 79;
        //System.out.println(Arrays.toString(search(nums,target)));

        int[] array = {3,4,2};
        int t = 6;
        int [] ans = twoSum(array, t);
        System.out.println(Arrays.toString(ans));
    }


    private static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length - 1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    private static int[] search(int[][] nums, int target){
        for (int row = 0; row<nums.length; row++){
            for (int col = 0; col<nums[row].length; col++){
                if (nums[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
