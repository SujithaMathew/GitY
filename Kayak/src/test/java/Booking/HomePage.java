package Booking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.FirstPage;
import PageObject.LoginPage;
import resources.base;

public class HomePage extends base{
	public static Logger log=(Logger) LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Initialize the driver");
	}
@Test(dataProvider="getData")
	public void loginPage(String Username) throws IOException {
		
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to the url");
       // driver.switchTo().alert().accept();
        
		FirstPage fi=new FirstPage(driver);
		fi.LogIn().click();
		log.info("Login clicked");
		//fi.Category().click();
		LoginPage lp=new LoginPage(driver);
		lp.getUserName().sendKeys(Username);
		log.info("Username Entered");
		lp.getSubmit().click();
		log.info("Submit clicked");
		
		
		
		
	}

@DataProvider
public Object[][] getData() {
	Object[][] data=new Object[2][1];
	data[0][0]="Sujitha";
	
	data[1][0]="Sowmi";
	return data;
	
	
			
}
@AfterTest
public void tearDown() {
	driver.close();
	driver=null;
}

}
