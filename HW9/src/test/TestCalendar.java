package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;





class TestCalendar  {

	@ParameterizedTest
	@ValueSource(ints ={ 2000, 2004, 2008, 2012, 2016})
	public void Should_return_true(int year) {
		// Implement
		assertTrue(new Calendar(year).isLeapYear());
		
		
		
		
		
	}

	@ParameterizedTest
	@ValueSource(ints= {2001, 2002, 2021, 2022, 2023})
	public void Should_return_false(int year) {
		// Implement
		assertFalse(new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= { 2000, 2001, 2002, 2003, 2004, 2005})
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		GregorianCalendar gcalendar = new GregorianCalendar(year,1,1,1,1);
		assertTrue(gcalendar.isLeapYear(year));
		
		
		
	}
	
	// Create a new method for boundary testing

	@ParameterizedTest
	@ValueSource(ints= { -2000, 2001, 2002, 2003, 2004, 2005})
	public void Should_return_false_if_year_is_negative(int year) {
		Exception exception = assertThrows(Exception.class, () -> new Calendar(year));
		assertEquals("Das Macht keinen Sinn", exception.getMessage());
	
}
}
