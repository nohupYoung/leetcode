import java.util.ArrayList;

public class ReverseVowelsOfAString {
	public String reverseVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        char[] ch=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j) {
        	if(!list.contains(ch[i])) {
        		i++;
        		continue;
        	}
        	if(!list.contains(ch[j])) {
        		j--;
        		continue;
        	}
        	char tmp=ch[i];
        	ch[i]=ch[j];
        	ch[j]=tmp;
        	i++;
        	j--;
        }
        return new String(ch);
    }
}
