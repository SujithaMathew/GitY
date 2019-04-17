package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FirstPage {
public WebDriver driver;
public FirstPage(WebDriver driver) {
	this.driver=driver;
}

By LogIn=By.xpath("//span[contains(text(),'Hello, Sign in')]");
By Category=By.xpath("//a[@id='nav-link-shopall']");
By Home=By.xpath("//a[contains(text(),'Home Furnishing')]");
By Deals=By.xpath("//a[contains(text(),'See all deals')]");

public WebElement LogIn() {
	return driver.findElement(LogIn);
}

public WebElement Category() {
	return driver.findElement(Category);
	
}
public WebElement Home() {
	return driver.findElement(Home);
	
}
public WebElement Deal() {
	return driver.findElement(Deals);
	
}
}
