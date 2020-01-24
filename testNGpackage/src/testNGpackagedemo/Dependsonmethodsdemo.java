package testNGpackagedemo;

import org.testng.annotations.Test;

public class Dependsonmethodsdemo {
	public class Prioritydemo {
		
		@Test
		public void startapp(){
			System.out.println("start application");
		}
		
		@Test(dependsOnMethods="startapp")
		public void login(){
			System.out.println("login");
		}
		
		@Test(dependsOnMethods="login")
		public void logout(){
			System.out.println("logout");
		}

	}
}
