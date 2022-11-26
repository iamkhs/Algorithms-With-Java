package searching_algorithms.linear_search;

public class Find_Min {
    public static void main(String [] args){

        int[] nums = {20,43,3,78,34,89,-1};
        System.out.println(findMin(nums));

    }

    // return the minimum value in the array
    private static int findMin(int[] nums){
        int min = nums[0];
        for (int i : nums){
            if (i < min){
                min = i;
            }
        }
        return min;
    }
}
