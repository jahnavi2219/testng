package groupsdemo;

import org.testng.annotations.Test;

public class Testclass1 {
	@Test(groups=("smoke"))
		public void Test1(){
		System.out.println("first smoke test");
	}
	
	@Test(groups=("smoke"))
			public void Test2(){
			System.out.println("second smoke test");
	}
	
	@Test(groups=("smoke"))
		public void Test3(){
		System.out.println("third smoke test");
	}
	
	@Test(groups=("regression"))
			public void Test4(){
			System.out.println("first regression test");
	}
	
}
