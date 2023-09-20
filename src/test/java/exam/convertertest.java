package exam;

import static org.junit.Assert.*;

import org.junit.Test;

import lib.converter;

public class convertertest {

	@Test
	public void testkmtoMile() {
		int length=100;
		double exp=62.1;
		
		double act =converter.kmToMile(length);
		assertEquals(exp,act,0.01);
	}
	
	@Test
	public void testCelToFar() {
		int temp=50;
		int exp=112;
		
		int act =converter.cTof(temp);
		assertEquals(exp,act);
	}

}
