
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class My_Project {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(20)
        );

        try {
            // Step 1: Open website
            driver.manage().window().maximize();
            driver.get("https://aniandanju.onrender.com/");

            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Page Title: " + driver.getTitle());

            // Step 2: Click Let's Begin Our Story
            By beginLocator = By.xpath(
                    "//button[contains(.,\"Let's Begin Our Story\")]"
            );

            WebElement beginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(beginLocator)
            );

            beginButton.click();
            System.out.println("Begin button clicked successfully.");

            // Step 3: Wait for proposal date
            By proposalDateLocator = By.xpath(
                    "//button[normalize-space(.)='26 October 2024']"
            );

            WebElement proposalDate = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            proposalDateLocator
                    )
            );

            proposalDate.click();
            System.out.println("Proposal date selected successfully.");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            // Keep browser open while testing.
            // Uncomment the next line when you want to close it:
            // driver.quit();

        }
    }
}
