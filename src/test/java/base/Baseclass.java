package base;

import org.testng.annotations.*;

public class Baseclass {
	
	
	@BeforeTest
	public void browserOpen() {
		
		System.out.println("Browser Open");
		
	}

	@AfterTest
	public void closed() {
		
		System.out.println("Browser Closed");

		
	}
}
