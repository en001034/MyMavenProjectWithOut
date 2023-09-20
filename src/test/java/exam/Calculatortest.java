package exam;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Calculator;

public class Calculatortest {

	@Test
	public void testadd() {
	int a=20;
	int b=30;
	int expres=50;
	
	int actres=Calculator.add(a, b);
	assertEquals(expres, actres);
	}
	
	@Test
	public void testsubtract() {
		
		int expres=10;
		
		int actres=Calculator.subtract(40, 30);
		assertEquals(expres, actres);
	
	}
	
	@Test
	public void testmultiply() {
		
		int expres=30;
		
		int actres=Calculator.multipy(10, 3);
		assertEquals(expres, actres);
	
	}

	@Test
	public void testdivision() {
		
		int expres=3;
		
		int actres=Calculator.divide(100, 30);
		assertEquals(expres, actres);
	
	}


}
