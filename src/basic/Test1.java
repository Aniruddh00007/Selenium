package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver = new  ChromeDriver();
    
     //driver.get("https://unsplash.com/");
     
     driver.navigate().to("https://unsplash.com/");
     driver.navigate().back();
     driver.navigate().forward();
     driver.manage().window().maximize();
     driver.navigate().refresh();
    // driver.close();
	}

}
