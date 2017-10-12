import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	private RomanNumerals converts = new RomanNumerals();

	@Test
	public void romanNumber() {
		assertArabic(1, "I");
	}
	@Test
	public void romanNumber2() {
		assertArabic(2, "II");
	}
	@Test
	public void romanNumber5() {
		assertArabic(5, "V");
	}
	@Test
	public void romanNumber10() {
		assertArabic(10, "X");
	}
	@Test
	public void romanNumber50() {
		assertArabic(50, "L");
	}
	@Test
	public void romanNumber100() {
		assertArabic(100, "C");
	}
	@Test
	public void romanNumber1000() {
		assertArabic(1000, "M");
	}
	@Test
	public void romanNumber11() {
		assertArabic(11, "XI");
	}
	@Test
	public void romanNumber90() {
		assertArabic(90, "XC");
	}
	@Test
	public void romanNumber99() {
		assertArabic(99, "XCIX");
	}
	@Test
	public void romanNumber1199() {
		assertArabic(1199, "MCXCIX");
	}
	@Test
	public void romanNumber1984() {
		assertArabic(1984, "MCMLXXXIV");
	}
	@Test
	public void romanNumber2014() {
		assertArabic(2014, "MMXIV");
	}	
				
	@Test
	public void romanNumber3999() {
		assertArabic(3999, "MMMCMXCIX");
	}
	
	private void assertArabic(int arabic, String romNum) {
		assertEquals(romNum, converts.romanNum(arabic));
	}

}
