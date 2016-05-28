public class productOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] prods = new int[nums.length];
		int p=1;
		prods[0]=p;
		for(int i=1;i<nums.length;i++) {
			p=p*nums[i-1];
			prods[i]=p;
		}

		p=1;
		for(int i=nums.length-2;i>=0;i--) {
			p=p*nums[i+1];
			prods[i]*=p;
		}
		return prods;
	}
}