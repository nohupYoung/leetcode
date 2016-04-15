public class ClimbingStairs {
	public int climbStairs(int n) {
		if (n==1) return 1;
		if (n==2) return 2;

		int nextToLast=1;
		int last=2;
		int answer=3;
		for (int i=3; i<=n; i++) {
			answer=nextToLast+last;
			nextToLast=last;
			last=answer;
		}
		return answer;
	}
}