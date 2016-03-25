public class AddDigits {
    public int addDigits(int num) {
        int answer=0;
        if(num>0){
           answer = (num-1)%9+1; 
        }
        return answer;
    }
}