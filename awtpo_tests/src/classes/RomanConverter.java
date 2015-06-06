package classes;

import java.util.Map;

public class RomanConverter {
	
	static int[] ARABIC_DIGITS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	static String[] ROMAN_DIGITS = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };

	public static String convert(int arabic) {
		String roman = "";
		for (int i = 0; i < ARABIC_DIGITS.length; i++) {
			while (arabic >= ARABIC_DIGITS[i]) {
				 roman += ROMAN_DIGITS[i];
				 arabic -= ARABIC_DIGITS[i];
			 }
		 }
		return roman;
	}
	//XIV
	public static int convert(String roman) {
		int arabic = 0;
		
		
		for (int i = 0; i < roman.length(); ++i) {
			for(int j = 0; j < ROMAN_DIGITS.length; ++j){
				if(ROMAN_DIGITS[j].length() == 1 && roman.charAt(i) == ROMAN_DIGITS[j].charAt(0)){
					arabic += ARABIC_DIGITS[j];
				}
				else if(ROMAN_DIGITS[j].length() == 2 && i < roman.length() - 1 && roman.charAt(i) == ROMAN_DIGITS[j].charAt(0) && roman.charAt(i + 1) == ROMAN_DIGITS[j].charAt(1)){
					arabic += ARABIC_DIGITS[j];
					++i;
				}
			}
			
		}
		return arabic;
	}
	
	public static void main(String[] args)
	{
		System.out.print(RomanConverter.convert("IV"));
	}

}
