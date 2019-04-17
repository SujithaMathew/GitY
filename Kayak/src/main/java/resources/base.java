package resources;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
public static WebDriver driver;
public Properties prop;
public WebDriver initializeDriver() throws IOException {
	prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\RayappanRaja\\Kayak\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
	     driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.firefox.driver", "C:\\Work\\geckodriver.exe");
	     driver=new FirefoxDriver();
	}
	else if(browserName.equals("IE")) {
		System.setProperty("webdriver.internetexplorer.driver", "C:\\Work\\MicrosoftWebDriver.exe");
	     driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
	return driver;
}
public void getScreenShot(String result) throws IOException {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src,new File("C:\\Test\\"+result+"Screen.png"));
}
}
