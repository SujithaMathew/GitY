package Booking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.FirstPage;

import resources.base;

public class Deals extends base {
	public static Logger log=(Logger) LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Initialize the driver");
		driver.get(prop.getProperty("url"));
		log.info("Enter the url");
	}
	@Test
	public void TodayDeals() throws IOException {
		
		
		FirstPage fi=new FirstPage(driver);
		fi.Deal().click();
		log.info("Todays deal clicked");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		driver=null;
	}

}
