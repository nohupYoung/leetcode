public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
    	int index=0;
        for(int i=0;i<nums.length;i++) {
        	if((nums[i]-target)>=0) {
        		return i;
        	}
        	index++;
        }
        return index;
    }
}