package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FormsHW extends Base{

		@Test(priority=1)
	public void textBox() {
		driver.navigate().to("https://demoqa.com/text-box");
		//input[@id='userName']
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		name.sendKeys("Manju");
		//input[@id='userEmail']
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("abc@gmail.com");
		//textarea[@id='currentAddress']
		WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		address.sendKeys("XXX,TVM");
		//textarea[@id='permanentAddress']
		WebElement peraddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		peraddress.sendKeys("YYY,Kollam");
		//button[@id='submit']
		WebElement submitt=driver.findElement(By.xpath("//button[@id='submit']"));
		submitt.click();
	}
	@Test(priority=2)
	public void checkBox() {
		driver.navigate().to("https://demoqa.com/checkbox");
		//rct-checkbox
					WebElement checkhome=driver.findElement(By.className("rct-checkbox"));
				checkhome.click();
			}
	/*@Test(priority=3)
	public void radio() {
	driver.navigate().to("https://demoqa.com/radio-button");
	//input[@id='yesRadio']
	
	//custom-control-input
	//WebElement yes=driver.findElement(By.id("yesRadio"));
	WebElement yes=driver.findElement(By.cssSelector("input.custom-control-input"));
		yes.click();
	
	}*/
}
	
	

