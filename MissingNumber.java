public class MissingNumber {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = (l+1)*l/2;
        for(int i=0;i<l;i++){
            sum-=nums[i];
        }
		return sum;
    }
}