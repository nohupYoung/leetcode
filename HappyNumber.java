public class HappyNumber {
    	public boolean isHappy(int n) {
		if(n<=0) return false;
		Set<Integer> set=new HashSet<>();
		while(n!=1) {
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
			n=trans(n);
		}
		return true;
    	}
	private int trans(int n) {
      		int sum = 0;
      		while (n != 0) {
  			sum += (n % 10) * (n % 10);
            		n /= 10;
		}
      		return sum;
    	}
}