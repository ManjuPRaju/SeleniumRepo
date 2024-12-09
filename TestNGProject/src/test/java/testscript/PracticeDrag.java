package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PracticeDrag extends Base{
	@Test
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		//span[text()='Draggable n°2']
		WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		//div[@id='mydropzone']
		WebElement drop=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions drag =new Actions(driver);
		drag.dragAndDrop(drag2, drop).build().perform();
		
		
	}

}
