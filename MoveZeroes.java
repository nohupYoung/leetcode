public class MoveZeroes {
      public void moveZeroes(int[] nums) {
    		int k=nums.length;
    		for(int i=0;i<k;i++) {
    			if (nums[i]==0) {
    				for (int j=i;j<k-1;j++) {
    					nums[j]=nums[j+1];
    				}
    				nums[k-1]=0;
    				k--;
    			}
    		}
      }
}