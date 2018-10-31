package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
 WebDriver driver =null;
	@Test
  public void f() {
	  
	  WebDriver driver =DriverUtility.getDriver("chrome");
	  driver.manage().window().maximize();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("aravind");
	  String s1=driver.getTitle();
	  System.out.println(s1);
	  Assert.assertTrue("Demo Web Shop. Login".startsWith("Demo"));
	  driver.findElement(By.xpath("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	//File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scrFile, new File("C:\\Users\\aravind.g.kumar\\Desktop\\Mercury Tours\\screenshot.png"));		
	  
  }
}
