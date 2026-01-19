package TestingMG_19th.TestingMG_19th_1;

import java.time.Duration;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class DropDown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement drpEle = driver.findElement(By.id("searchDropdownBox"));
		Select drpelem = new Select(drpEle);
		
		
		
		
		 driver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
		
		 //drpelem.selectByVisibleText("Appliances");
		
		 //driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
		List<WebElement> options = drpelem.getOptions();
		System.out.println("number of elements in:" + options.size());  // print number of options
		
		for(int i = 0; i < options.size(); i++) { //printing the list of options
			System.out.println(options.get(i).getText());
		}
		
		WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
		SearchButton.click();
	

	}
}


