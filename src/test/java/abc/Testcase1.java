package abc;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;

public class Testcase1 extends Baseclass {
	
	@Test
	public void testcase1() {
		
		Assert.assertTrue(false);
		System.out.println("Test case 1 exceuted");
		
		
	}

}
