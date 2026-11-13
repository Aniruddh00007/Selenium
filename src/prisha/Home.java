
package prisha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

    public void HomeTest(ChromeDriver driver) throws InterruptedException {

        driver.navigate().to("https://prisha-enterprises.in/index.php");



        driver.navigate().to("https://prisha-enterprises.in/shop.php?category=disposable-containers");
        
      Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[data-product-id='4']")).sendKeys(org.openqa.selenium.Keys.ENTER);
        driver.findElement(By.cssSelector("button[data-product-id='6']")).sendKeys(org.openqa.selenium.Keys.ENTER);

        driver.findElement(By.cssSelector("button.btn")).click();
    


		 
		 
//		
	 }
}