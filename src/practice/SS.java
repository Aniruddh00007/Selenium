package practice;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SS {

	@Test
public  void SS() throws IOException{
	
  WebDriver driver = new ChromeDriver(); 
  driver.manage().window().maximize();
  
   driver.get("https://www.amazon.in/");
   
   
   TakesScreenshot ts  = (TakesScreenshot) driver;
   
   File source = ts.getScreenshotAs(OutputType.FILE);
   
   
   File destination = new File("D:\\\\Selenium\\\\test1.png");

   Files.copy(source.toPath(), destination.toPath());
   
   
   
   System.out.println("Screenshot le liye hai ");
  
  
	
}

}
