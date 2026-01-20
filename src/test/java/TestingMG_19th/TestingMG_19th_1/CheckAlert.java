package TestingMG_19th.TestingMG_19th_1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckAlert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		WebElement LoginButton = driver.findElement(By.xpath("//button[@name='proceed']"));
		LoginButton.click();
		
		Alert alert = driver.switchTo().alert(); // switch to alert
		String alertMessage = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage); // Print Alert Message
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		alert.accept(); // Accept the alert
	
		
		
		
			
//		ssc.init(driver);
//		String actAlert = ssc.Extract_Alert_message();
//		System.out.println("Alert message is : " + " " + actAlert);
//		
		
//		public String Extract_Alert_Message() throws InterruptedException {
//			ssc.init(driver);
//			String actAlert = ssc.Extract_Alert_message();
//			System.out.println("Alert message is : " + " " + actAlert);
//			
//		}		
//		
//		 driver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
//		
//		 //drpelem.selectByVisibleText("Appliances");
//		
//		 //driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
//		
//		List<WebElement> options = drpelem.getOptions();
//		System.out.println("number of elements in:" + options.size());  // print number of options
//		
//		for(int i = 0; i < options.size(); i++) { //printing the list of options
//			System.out.println(options.get(i).getText());
//		}
//		
//		WebElement SearchButton = driver.findElement(By.id("nav-search-submit-button"));
//		SearchButton.click();
//	

	}

}
