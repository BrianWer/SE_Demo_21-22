package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		
		assertEquals(5, calculator.add(2,3) );
		
		
		
		
	}

	@ParameterizedTest
	@CsvSource({
		"1, 2",
		"3, 4"
	})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		
		assertEquals(valueOne+valueTwo, calculator.add(valueOne,valueTwo) );
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		
		assertEquals(-1, calculator.sub(2,3) );
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		
		assertEquals(6, calculator.multiply(2,3) );
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		
		assertEquals(2, calculator.divide(6,3) );
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculator.divide(1, 0));
		assertEquals("ZeroDivisionError", exception.getMessage());
		
		
		
	}
}
