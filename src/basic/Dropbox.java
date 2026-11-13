package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/payment-gateway/index.php");
		driver.findElement(By.name("quantity")).sendKeys("4");
		driver.findElement(By.className("button")).click(); 
		
		driver.findElement(By.name("card_nmuber")).sendKeys("41111111111111111");
		driver.findElement(By.name("month")).sendKeys("08");
		driver.findElement(By.name("year")).sendKeys("29");
		driver.findElement(By.name("cvv_code")).sendKeys("456");
		
		driver.findElement(By.name("submit")).click();
		
		
	}

}
 //https://demo.guru99.com/telecom/addcustomer.php