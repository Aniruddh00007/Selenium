package basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String args[]) {
//https://demo.guru99.com/test/upload/
	
	ChromeDriver driver = new ChromeDriver();
	
       
        driver.navigate().to("https://demo.guru99.com/test/upload");
        driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\Aniruddh\\Downloads\\61713457391643676.jpg");
        driver.findElement(By.name("terms")).click();
        driver.findElement(By.name("send")).click();
        
        }
}
