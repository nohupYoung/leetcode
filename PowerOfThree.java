public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        double epsilon=0.0000000001;
        if(n<=0) return false;
        double index=0.0;
        index=Math.log(n)/Math.log(3);
        return Math.abs(index-Math.round(index))<epsilon;
    }
}