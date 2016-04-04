public class ContainsDuplicate_Hash {
    public boolean containsDuplicate(int[] nums) {
        
        if(nums==null || nums.length<2) {
			return false;
		}
		
		HashSet<Integer> set = new HashSet<>();
		for (int i:nums) {
			if(!set.add(i)){
				return true;
			}
			
		}
		return false;
    }
}