import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import classes.RomanConverter;


public class MyTests {

	@Test
	public void convertIntToRoman() {
		
		String result = RomanConverter.convert(1);
		Assert.assertEquals("", "I", result);
		
		result = RomanConverter.convert(2);
		Assert.assertEquals("", "II", result);
		
		result = RomanConverter.convert(10);
		Assert.assertEquals("", "X", result);

	}
	
	@Test
	public void convertRomanToInt() {
		
		int result = RomanConverter.convert("I");
		Assert.assertEquals(1, result);
		
		result = RomanConverter.convert("II");
		Assert.assertEquals(2, result);
		
		result = RomanConverter.convert("X");
		Assert.assertEquals(10, result);

	}

}
