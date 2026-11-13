package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
		
		WebDriver driver = new ChromeDriver();
		
		   WebDriverWait wait = new WebDriverWait(
		            driver, Duration.ofSeconds(10)
		        );
		
		driver.get("https://demoqa.com/buttons");
		
		// double click 
				WebElement dc =driver.findElement(By.id("doubleClickBtn"));
				Actions action = new Actions(driver);
				 action.doubleClick(dc).perform();
				 
				 
	// right click 	
		WebElement rc =driver.findElement(By.id("rightClickBtn"));
		
	
		action.contextClick(rc).perform();
		
		
		
		 // click

		 WebElement cl = wait.until(
				    ExpectedConditions.elementToBeClickable(
				        By.xpath("//button[normalize-space(.)='Click Me']")
				    )
				);

				cl.click();

	
	
}



       


	
	}


