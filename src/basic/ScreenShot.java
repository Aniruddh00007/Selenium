package basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShot {

	public static void main(String[] args) throws IOException{
		
       
	       WebDriver driver = new ChromeDriver();

	   
	        driver.manage().window().maximize();
	        driver.get("https://demo.guru99.com/");

	        // Capture Screenshot
	        TakesScreenshot ts = (TakesScreenshot) driver;

	        File source = ts.getScreenshotAs(OutputType.FILE);

	        // Save Screenshot
	        File destination = new File("D:\\Selenium\\test.png");

	        Files.copy(source.toPath(), destination.toPath());

	        System.out.println("Screenshot captured successfully!");

	}
	
	

}
