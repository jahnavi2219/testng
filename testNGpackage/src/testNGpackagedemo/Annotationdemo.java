package testNGpackagedemo;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationdemo {
	
	@BeforeSuite
	
	public void setproperty(){
		System.out.println("set driver path");
	}
	
	@BeforeTest
	public void openchrome(){
		System.out.println("open chrome");
	}
	
	@BeforeClass
	public void openapp(){
		System.out.println("Application");
	}
	
	@BeforeMethod
	public void gettitle(){
		System.out.println("display title");
	}
	
	@Test
	public void checktitle(){
		System.out.println("check title");
	}
	
	@AfterMethod
	public void login(){
		System.out.println("login to test");
	}
	
	@AfterClass
	public void logout(){
		System.out.println("logout of test");
	}
	
	@AfterTest
	public void closebrowser(){
		System.out.println("close browser");
	}
}
