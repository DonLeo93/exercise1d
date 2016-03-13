package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest {
	private ArrayConverter converter;

	@Before
	public void setup() {
		converter = new ArrayConverter();
	}
	
	@Test
	public void testConvertToInts_shouldReturnInteger(){
		String[] values = {"5","2"};
		int expected[] = converter.convertToInts(values);
		assertArrayEquals(expected, expected);
	}
	
	@Test(expected=NullPointerException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForNullArgument() {
		String[] values = null;
		
		converter.convertToInts(values);
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_shouldRaiseAnExceptionForNonIntegerArgument() {
		String[] values = {"test"};
		
		converter.convertToInts(values);
		
		// then
		// empty
	}

}
