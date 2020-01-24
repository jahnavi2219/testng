package testNGpackagedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alwaysrundemo {
	WebDriver driver;
	@Test
	public void startapp(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		 driver.manage().window().maximize();
		 System.out.println("start application");
	}
	
	@Test(dependsOnMethods="startapp")
		public void checktitle(){
			driver.findElement(By.id("Email")).sendKeys("rekhab@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("rekhab");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			String expectedname="DemoWebStore";
			
			String actualname=driver.getTitle();
			System.out.println(actualname);
			Assert.assertEquals(expectedname,actualname);
			driver.findElement(By.linkText("Log out")).click();
			System.out.println("logout application");
	}
	
	@Test(dependsOnMethods="checktitle",alwaysRun=true)
	public void logoff(){
		driver.close();
	}
}
