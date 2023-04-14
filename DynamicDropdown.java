import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//handling autosuggested dropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		//parent child relationship
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='HYD']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();
		Thread.sleep(2000);
		
		//calender
		driver.findElement(By.cssSelector("a[class*='ui-state-default ui-state-highlight']")).click();
		
		//radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//enabled or disabled
		/* System.out.println( driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());*/
		
		driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its abled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		// handling checkbox
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).isSelected());
		
		//count the number of checkboxes
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
	}

}
