public class ReverseString {
    public String reverseString(String s) {
        String[] str=s.split("");
		StringBuilder sb = new StringBuilder();
		for (int i = str.length-1; i >= 0 ; i--) {
			sb.append(str[i]);
		}
		return sb.toString();
    }
}