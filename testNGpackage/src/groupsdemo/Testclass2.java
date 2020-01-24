package groupsdemo;

import org.testng.annotations.Test;

public class Testclass2 {
	@Test(groups=("regression"))
			public void Test5(){
			System.out.println("second regression test");
		}
	
	@Test(groups=("regression"))
			public void Test6(){
			System.out.println("third regression test");
	}
	
	@Test(groups=("regression"))
		public void Test7(){
		System.out.println("fourth regression test");
	}
	
	@Test(groups=("smoke"))
	public void Test8(){
	System.out.println("fourth smoke test");
}



}
