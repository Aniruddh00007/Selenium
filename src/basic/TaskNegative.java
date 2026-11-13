package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskNegative {
  
	
	public static void main(String args[]) {
		
ChromeDriver driver = new ChromeDriver(); 
		
		driver.navigate().to("https://demo.guru99.com/telecom/addcustomer.php");
		
//		driver.findElement(By.id("done")).click();
		driver.findElement(By.name("fname")).sendKeys("122");
		driver.findElement(By.name("lname")).sendKeys("221");
		driver.findElement(By.name("emailid")).sendKeys("anshu7973@gmail.in");
		driver.findElement(By.name("addr")).sendKeys("Delhi12@@@@");
		driver.findElement(By.name("telephoneno")).sendKeys("8146432981dasdasdas");
		 driver.findElement(By.name("submit")).click();
		
	}
}
