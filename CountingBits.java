public class CountingBits {
    public int[] countBits(int num) {
        int[] results = new int[num+1];
        for (int i=0;i<=num;i++){
            results[i]=Integer.bitCount(i);
        }
        return results;
    }
}
