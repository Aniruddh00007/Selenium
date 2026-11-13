package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click {

	@Test
	public void clii() {
		
		WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        
        driver.findElement(By.className("s-image")).click();
        driver.findElement(By.className("s-image")).click();
        test122;
        
	}
}
