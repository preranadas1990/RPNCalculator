package test.java;

import junit.framework.TestCase;
import main.java.RpnCal;

public class TestDrivenRPN extends TestCase{

	public void testCase1(){
		String expr = "3,4,+,5,-";
		RpnCal rpnc = new RpnCal();	
		try {
			assertEquals(2.0,rpnc.calculate(expr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testCase2(){
		String expr = "3,+,4,5,-";
		RpnCal rpnc = new RpnCal();	
		try {
			assertEquals(2,rpnc.calculate(expr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertTrue(true);
		}
	}
	public void testCase3() {
		String expr = "+,3,4,-,5";
		RpnCal rpnc = new RpnCal();	
		try {
			assertEquals(2.0,rpnc.calculate(expr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			assertEquals("expr is empty",e.getMessage());
		}
	}
	
	public void testCase4() throws Exception{
		String expr = "";
		RpnCal rpnc = new RpnCal();	
		assertEquals(2.0,rpnc.calculate(expr));
	}
	
	
	public void testCase5() throws Exception{
		String expr = "10,%";
		RpnCal rpnc = new RpnCal();	
		assertEquals(0.1,rpnc.calculate(expr));
	}
	public void testCase6() throws Exception{
		String expr = "4,!";
		RpnCal rpnc = new RpnCal();	
		assertEquals(24,rpnc.calculate(expr));
	}
	public void testCase7(){
		String expr = "3,4,*,5,/";
		RpnCal rpnc = new RpnCal();	
		try {
			assertEquals(2.4,rpnc.calculate(expr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
