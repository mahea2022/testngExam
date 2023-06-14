package utility;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	static WebDriver driver;
	@Test
	public static WebDriver init () {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().deleteAllCookies();
	 driver.get("https://techfios.com/test/106/index.php");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
		
	}
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

}


