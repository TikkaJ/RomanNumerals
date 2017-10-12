import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
	private Map<Integer, String> conversions = new HashMap<>();
	
	public RomanNumerals() {
		conversions.put(1, "I");
		conversions.put(4, "IV");
		conversions.put(5, "V");
		conversions.put(9, "IX");
		conversions.put(10, "X");
		conversions.put(50, "L");
		conversions.put(80, "LXXX");
		conversions.put(90, "XC");
		conversions.put(100, "C");
		conversions.put(900, "CM");
		conversions.put(1000, "M");
	}
	
	public String romanNum(int convertToInteger) {
		String romanNumeral = conversions.get(convertToInteger);
		if(romanNumeral == null) {
			romanNumeral = "";
			while(convertToInteger > 0) {
				if(convertToInteger >= 1000) {
					romanNumeral = romanNumeral + conversions.get(1000);
					convertToInteger = convertToInteger - 1000;
				}else if(convertToInteger >= 900) {
					romanNumeral = romanNumeral + conversions.get(900);
					convertToInteger = convertToInteger - 900;
				}else if(convertToInteger >= 100) {
					romanNumeral = romanNumeral + conversions.get(100);
					convertToInteger = convertToInteger - 100;
				} else if(convertToInteger >= 90) {
					romanNumeral = romanNumeral + conversions.get(90);
					convertToInteger = convertToInteger - 90;
				}else if(convertToInteger >= 80) {
					romanNumeral = romanNumeral + conversions.get(80);
					convertToInteger = convertToInteger - 80; 
				}else if(convertToInteger >= 10) {
					romanNumeral = romanNumeral + conversions.get(10);
					convertToInteger = convertToInteger - 10;
				} else if(convertToInteger >= 9) {
					romanNumeral = romanNumeral + conversions.get(9);
					convertToInteger = convertToInteger - 9;
				} else if(convertToInteger >= 5) {
					romanNumeral = romanNumeral + conversions.get(5);
					convertToInteger = convertToInteger - 5;
				} else if(convertToInteger >= 4) {
					romanNumeral = romanNumeral + conversions.get(4);
					convertToInteger = convertToInteger - 4;
				} else {
					romanNumeral = romanNumeral + conversions.get(1);
				     convertToInteger = convertToInteger - 1;
				}
			}
		}
		return romanNumeral;
	}
	
}
