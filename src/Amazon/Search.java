package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Search {
    
	
	public void searchCar() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/");
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Die cast model");
	 driver.findElement(By.id(" nav-search-submit-button")).click();
	 driver.findElement(By.className("a-autoid-2")).click();
	
	
	 
	 driver.findElement(By.id("add-to-cart-button")).click();
	 driver.findElement(By.id("twotabsearchtextbox")).clear();
	
}
	
	public void search() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("smk typhoon");
		 driver.findElement(By.id(" nav-search-submit-button")).click();
		
		 driver.findElement(By.cssSelector("img.s-image")).click(); 
		 
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
	}
	 
	
	public void gears() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.com/");
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("riding gears");
		 driver.findElement(By.id(" nav-search-submit-button")).click();
		
		
		 driver.findElement(By.className("a-link-normal s-line-clamp-3 s-link-style a-text-normal")).click();
		 
		 driver.findElement(By.id("add-to-cart-button")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
	}
	
}