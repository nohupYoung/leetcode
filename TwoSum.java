public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
		if(nums.length<2 || nums==null) {
			return a;
		}
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(!map.containsKey(target-nums[i])) {
				map.put(nums[i], i);
			} else {
				a[0]=map.get(target-nums[i]);
				a[1]=i;
				break;
			}
		}
		return a;
    }
}