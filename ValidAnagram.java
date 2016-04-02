public class ValidAnagram {
    
        public boolean isAnagram(String s, String t) {
         
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
         
        char[] charListS = s.toCharArray();
        char[] charListT = t.toCharArray();
         
        Arrays.sort(charListS);
        Arrays.sort(charListT);
         
        for (int i = 0; i < charListS.length; i++) {
            if (charListS[i] != charListT[i]) {
                return false;
            }
        }
         
        return true;
    }
}
