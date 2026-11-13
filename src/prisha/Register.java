package prisha;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		 driver.navigate().to("https://prisha-enterprises.in/");  
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.cssSelector("i.fa-regular")).click();
		 driver.findElement(By.linkText("Create an account")).click();
		 driver.findElement(By.name("name")).sendKeys("Aniruddh");
		 driver.findElement(By.name("email")).sendKeys("Aniruddh122@gmail.com");
		 driver.findElement(By.name("phone")).sendKeys("9876345689");
		 driver.findElement(By.name("password")).sendKeys("test1");
		 driver.findElement(By.name("confirm_password")).sendKeys("test1");
		 driver.findElement(By.cssSelector("button.btn")).click();
//		 
		 //login
		 loginpage lgn = new loginpage();
		  lgn.loginTest(driver);
		
		  //home page 
		  
		  Home hm = new Home();
    	  hm.HomeTest(driver);
		 
		 
		 // cart 
		 
		 Cart ct = new Cart();
		 ct.cartTest(driver);
	}

}
