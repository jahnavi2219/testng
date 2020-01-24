package testNGpackagedemo;

import org.testng.annotations.Test;

public class Prioritydemo {
	
	@Test
	public void startapp(){
		System.out.println("start application");
	}
	
	@Test(priority=1)
	public void login(){
		System.out.println("login");
	}
	
	@Test
	public void logout(){
		System.out.println("logout");
	}

}
