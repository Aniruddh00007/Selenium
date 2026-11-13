package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkout {
	
	@Test
	public void check() {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
	
	driver.findElement(By.className("a-button-input")).click();
	
}

}