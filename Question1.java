package assignment24;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public static void main(String[] args) {
        String romanNumeral = "LVIII";
        int number = convertToInteger(romanNumeral);
        System.out.println(romanNumeral + " in decimal is: " + number);
    }
    
    public static int convertToInteger(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        
        int result = 0;
        int previousValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = values.get(s.charAt(i));
            
            if (currentValue >= previousValue) {
                result += currentValue;
            } else {
                result -= currentValue;
            }
            
            previousValue = currentValue;
        }
        
        return result;
    }

}
