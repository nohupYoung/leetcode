public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}