public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length==0) return 0;
		if(nums.length==1) return 1;
		int fast=1;
		int slow=1;
		int current=nums[0];
		while(fast<nums.length) {
			if(nums[fast]!=current) {
				nums[slow]=nums[fast];
				current=nums[slow];
				slow++;
			} else {
				fast++;
			}
		}
		return slow;
        
	}
}