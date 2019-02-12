package upcastdowncast;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Parent {
	
	
	public void msg()
	{
		System.out.println("I am parent msg");
	}
	public void wake() {
		System.out.println("I am parent wake");
		
	}
	public void openBrowser(WebDriver driver, DesiredCapabilities cap) throws Exception
	{
	cap=DesiredCapabilities.firefox();
	cap.setPlatform(Platform.WIN10);
	URL url= new URL("http://192.168.147.1:4444/wd/hub");
	driver=new RemoteWebDriver(url, cap);
	driver.get("http://www.amazon.com");
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.quit();
	}
}
