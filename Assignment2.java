import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Pragati");
		driver.findElement(By.xpath("//input[contains(@class,'form-control ng-untouched ng-pristine ng-invalid')]")).sendKeys("prkumar@itconvergence.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Welcome123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticdropdown= driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("07/10/2001");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
		
		
	}
	}