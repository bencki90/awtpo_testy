import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import classes.RomanConverter;

@RunWith(Parameterized.class)
public class MyTests {

	public int arabicNumber;
	public String romanNumber;
	
	public MyTests(int arabicNumber, String romanNumber) {
		this.arabicNumber = arabicNumber;
		this.romanNumber = romanNumber;
	}

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 1, "I" }, { 5, "V" }, { 4, "IV"}, { 9, "IX"} };
		return Arrays.asList(data);
	}
	
	@Test
	public void convertIntToRoman() {
		
		String result = RomanConverter.convert(arabicNumber);
		Assert.assertEquals(romanNumber, result);
	}
	
	@Test
	public void convertRomanToInt() {
		
		int result = RomanConverter.convert(romanNumber);
		Assert.assertEquals(arabicNumber, result);
	}
}
