public class IntToRoman {  
    public String intToRoman(int num) {  
        String[][] roman = {  
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},  
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},  
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},  
            {"", "M", "MM", "MMM"}  
        };  
          
        String result = "";  
        int row = 0;  
        while (num != 0) {  
            int col = num % 10;  
            result = roman[row][col] + result;  
            row++;  
            num /= 10;  
        }  
          
        return result;  
    }  
}  