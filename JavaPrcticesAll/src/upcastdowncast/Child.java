package upcastdowncast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Child extends Parent {
	
	DesiredCapabilities cap;
	WebDriver driver;
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	
	
	public void msg() {
		System.out.println("I am in Child msg");
	}

	
	public void sleep() {
		System.out.println("I am in Child sleep");
	}
	@Test
	public  void child() throws Exception {
		
		
		Child c= new Child();
		Parent p=new Parent();
		//c.msg();      //1
		p.msg();      //2
		
		
		//P1.msg();		//3
		//P1.sleep();	//4
		//c.sleep();		//5
		//Child C1=(Child)P1;
		//C1.sleep();		//6
		
		//calling the parent
		c.openBrowser(driver,cap);
		
			}

}
