import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\prkumar\\Downloads\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\prkumar\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver2= new EdgeDriver();
		
		
		driver.get("https://www.udemy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		driver1.get("https://www.udemy.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		//driver1.close();
		//driver1.quit();
		
		driver2.get("https://www.udemy.com");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		//driver2.close();
		//driver2.quit();
	}

}