package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class opencart {

	@Test
	public void opencart() {
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-cart-count-container")).click();
	}
}
