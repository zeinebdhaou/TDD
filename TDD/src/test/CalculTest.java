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
	
	
}
