import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		//Invoke Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Implicit wait - 5 second timeout..this is the maximum time till browser wait for the result
		//if result is not load in this duration then test case get failed.
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		

		driver.findElement(By.id("inputUsername")).sendKeys("Pragati");
		
		driver.findElement(By.name("inputPassword")).sendKeys("hgfrg");
		
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
	    //xpath
		driver.findElement(By.xpath("//input[@placeholder=\'Name']")).sendKeys("Pragati");
		driver.findElement(By.xpath("//input[@placeholder=\'Email']")).sendKeys("prkumar@itconvgence.com");
		driver.findElement(By.xpath("//input[@placeholder=\'Email']")).clear();
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("prkumar@itconvergence.com");
		
	    //cssSelector
		driver.findElement(By.cssSelector("input[type='text']:nth-of-type(3)")).sendKeys("36357443325");
		driver.findElement(By.cssSelector("input[type='text']:nth-of-type(3)")).clear();
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("36357443325");
//		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		
		
		

	}

}
