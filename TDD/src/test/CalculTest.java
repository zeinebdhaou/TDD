package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import main.Calculator;

public class CalculTest {
    //When adding 2 integers where one of them is negative
	//Then display an error message
	  @Test
	   public  void  testAdd_NegativeInteger() {
	        Calculator calculator = new Calculator();
	        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add(-1, 2));
	        assertEquals("Inputs cannot be negative.", exception.getMessage());
	    }
	  //When adding 2 positive integers
	  //Then display the accurate result of the addition of the 2 inputs
	  @Test
	   public  void testAdd_PositiveIntegers() {
	        Calculator calculator = new Calculator();
	        assertEquals(5, calculator.add(2, 3));
	    }
	  
	  //When adding 2 inputs where one of them (or both) are not integers
	  //Then display an error message
	    @Test
	    public void testAdd_NonIntegerInputs() {
	        Calculator calculator = new Calculator();
	        IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> calculator.add(2,  2.5));
	        IllegalArgumentException exception2 = assertThrows(IllegalArgumentException.class, () -> calculator.add( 2.5, 2));
	        IllegalArgumentException exception3 = assertThrows(IllegalArgumentException.class, () -> calculator.add( 2.5, 2.5));
	        assertEquals("Both inputs must be integers.", exception1.getMessage());
	        assertEquals("Both inputs must be integers.", exception2.getMessage());
	        assertEquals("Both inputs must be integers.", exception3.getMessage());
	    }
	  
	
}
