package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	By Username=By.xpath("//input[@name='email']");
	
	By Submit=By.xpath("//input[@id='continue']");
	//By Logo=By.xpath("//i[@class='a-icon a-icon-logo']");

	public WebElement getUserName() {
		return driver.findElement(Username);
	}
	
	public WebElement getSubmit() {
		return driver.findElement(Submit);
	}
	/*public WebElement getLogo() {
		return driver.findElement(Logo);
	}*/
}
