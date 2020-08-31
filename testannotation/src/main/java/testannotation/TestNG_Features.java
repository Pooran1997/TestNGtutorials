package testannotation;

import org.testng.annotations.Test;

public class TestNG_Features {
	
	@Test
	public void Loginpage() {
		
		System.out.println("this is login test");
		int i=10/0;
		
		
	}

	@Test(dependsOnMethods ="Loginpage")	
	public void homepage() {
		
		System.out.println("this is the homepage");
	}
}
