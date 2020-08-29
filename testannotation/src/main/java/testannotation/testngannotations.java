package testannotation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngannotations {

@BeforeClass
public void beforedata() {
	
	System.out.println("this is the before class data");
}
	
@BeforeSuite
public void beforesuite() {
	
	System.out.println("this is the before suite data");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("this is the before method data");
}

@BeforeTest
public void beforetest() {
System.out.println("this is the before test data");
}

/*priority is used to define the sequence of test cases */
@Test(priority = 1)
public void testdata() {
	System.out.println("this is the test data with priority 0");
	
}

@Test(priority = 2)
public void testdata2() {
	System.out.println("this is the test data");
}
}
