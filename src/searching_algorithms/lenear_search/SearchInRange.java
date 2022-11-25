package searching_algorithms.lenear_search;

public class SearchInRange {
    public static void main(String[] args){

        int[] nums = {20,43,3,78,34,89};
        int target = 3;
        int index = search(nums, target, 1,4);
        System.out.println(index);

    }

    private static int search(int[] nums, int target, int start, int end){
        for (int i = start; i<=end; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
}
