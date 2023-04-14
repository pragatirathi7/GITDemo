import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkandList_pragati {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prkumar\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select s = new Select(staticDropdown);
		ArrayList originalList = new ArrayList();
		 for (WebElement e : s.getOptions()) {
		  originalList.add(e.getText());
		 }
		 ArrayList tList = originalList;
		 System.out.println(tList);
		 Collections.sort(tList); 
		 System.out.println(tList);
		 

	}

}
