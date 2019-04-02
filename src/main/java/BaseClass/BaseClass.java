package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public static void initializeBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\varsha_patke\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/index.php");
}

public static void close()
{
	driver.close();
}
}
