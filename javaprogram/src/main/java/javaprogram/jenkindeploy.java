package javaprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jenkindeploy{

	public static void main(String[] args) throws InterruptedException{
		//To find the factorial
      
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
         driver.findElement(By.id("username")).sendKeys("student");
         driver.findElement(By.id("password")).sendKeys("Password123");
         driver.findElement(By.id("submit")).click();
         
         driver.findElement(By.xpath("//a[@href='https://practicetestautomation.com/contact/']")).click();
         driver.findElement(By.id("wpforms-161-field_0")).sendKeys("Dheeraj");
         driver.findElement(By.id("wpforms-161-field_0-last")).sendKeys("Awasthi");
         driver.findElement(By.id("wpforms-161-field_1")).sendKeys("dheeraj_awasthi678@gmail.com");
         driver.findElement(By.id("wpforms-161-field_2")).sendKeys("**Test automation** is the process of using software tools and scripts to automatically execute test cases, compare actual outcomes with expected results, and report defects. It helps increase testing efficiency, speed, and coverage, especially for repetitive and regression tests. Automated testing is widely used in continuous integration/continuous deployment (CI/CD) pipelines to ensure software quality and stability during frequent code changes. Popular tools for test automation include Selenium, JUnit, TestNG, and Appium.");
	     
         System.out.println("Please solve the CAPTCHA manually...");
         Thread.sleep(30000);  // Wait for 30 seconds

	     driver.findElement(By.id("wpforms-submit-161")).click();
	}

}
