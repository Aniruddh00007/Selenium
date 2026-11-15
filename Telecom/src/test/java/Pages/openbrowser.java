package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class openbrowser {
     String URL = "https://demo.guru99.com/telecom/index.html";
	public WebDriver driver;
	
	
	public void Launch() {
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(URL);
	}
}
