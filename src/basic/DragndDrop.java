package basic;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragndDrop {
 
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	 @Test
         public void open() {  
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
	   driver.manage().window().maximize();
	 //  Switch to iframe
      // driver.switchTo().frame(0);
	    
	   WebElement source = driver.findElement(By.id("fourth"));
	   WebElement target = driver.findElement(By.cssSelector("#amt7"));
	   
	  
	   Actions actions = new Actions(driver);
	   actions.dragAndDrop(source, target).perform();
	   driver.switchTo().defaultContent();
	  
           //driver.quit();
	   
		
	}

}
