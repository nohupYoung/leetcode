public class PlusOne {
	public int[] plusOne(int[] digits) {
		if(digits==null || digits.length==0) return digits;
		int addition=1;
		for(int i=digits.length-1;i>=0;i--) {
			int current=(digits[i]+addition)%10;
			addition=(digits[i]+addition)/10;
			digits[i]=current;
			if(addition==0) {
				return digits;
			}
		}
		int[] result=new int[digits.length+1];
		result[0]=1;
		for(int i=1;i<result.length;i++) {
			result[i]=digits[i-1];
		}
		return result;
        
	}
}