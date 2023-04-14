import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oraclecloud {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ekwm-dev1.login.us6.oraclecloud.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("userid")).sendKeys("mjaime");
		driver.findElement(By.name("password")).sendKeys("Welcome123");
		driver.findElement(By.className("btnActiveChooser")).click();
		driver.findElement(By.xpath("//a[@title='Navigator']")).click();
		driver.findElement(By.xpath("//a[text()='Show More']")).click();
		//driver.findElement(By.xpath("//a[@id='pt1:_UISnvr:0:nv_itemNode_payables_payables_payments']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//span[text()='Payments']")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Tasks')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Payment']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Search: Business Unit')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'IT Convergence India - Hyderabad')]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Search: Supplier or Party')]")).click();
		driver.findElement(By.xpath("//input[contains(@aria-label,\" Party Name\")]")).sendKeys("IT");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'IT Monteur')]")).click();
		driver.findElement(By.xpath("//button[contains(@id,'lovDialogId::ok')]")).click();
		//driver.findElement(By.tagName("//textarea")).sendKeys("Hello");
		driver.findElement(By.xpath("//a[contains(@title,'Search: Disbursement Bank Account')]")).click();
		driver.findElement(By.xpath("//span[text()='HDFC Current CS']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@title,'Search: Payment Process Profile')]")).click();
		driver.findElement(By.xpath("//span[text()='PayPal']")).click();
		driver.close();
		
	}
}
