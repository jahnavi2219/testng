package ListenersDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ListenersDemo.Mylistener.class})

public class Verifygooglepagetest {
	WebDriver driver;
	@BeforeMethod
public void startapp(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
}
	@Test
	public void checktitle(){
		String title=driver.getTitle();
		String expectedtitle="google";
		Assert.assertEquals(expectedtitle, title);
	}
	@Test(priority=1)
	public void checklogo(){
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
}
