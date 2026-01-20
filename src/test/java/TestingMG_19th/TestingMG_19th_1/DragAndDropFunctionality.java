package TestingMG_19th.TestingMG_19th_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropFunctionality {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://jqueryui.com/droppable/");

		//Switch to frames containing the demo
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		new Actions(driver)
		.dragAndDrop(draggable, droppable)
		.perform();

		// Verify the drag-and-drop operation
		String droppedText = droppable.getText();
		if (droppedText.equals("Dropped!")) {
			System.out.println("Drag and drop successfully done!");
		} else {
			System.out.println("Drag and drop not done successfully");
		}

		// Close the browser
		driver.quit();

	}
}
