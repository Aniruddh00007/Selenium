package basic;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test2 {

	public static void main(String[] args) {  
		
		WebDriver driver = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select Browser name :"); 
		
		String browser= sc.nextLine();
		
		if(browser.equals("Chrome")) {
			        WebDriver dri = new ChromeDriver();			        
			        driver =dri;	
		}
	
		
		else if(browser.equals("Edge")) {		
			WebDriver dri = new EdgeDriver();
			driver = dri;
			
		}
		
		
			        driver.get("http://127.0.0.1:5500/Login.html?");

			        driver.findElement(By.id("userId")).sendKeys("admin");

			        driver.findElement(By.id("password")).sendKeys("admin123");
			        
			        

			        driver.findElement(By.className("login-btn")).click();
			        
			        Alert alert = driver.switchTo().alert();

			        System.out.println(alert.getText());

			        alert.accept();

			        //driver.quit();
			    }
				    	  

	}


