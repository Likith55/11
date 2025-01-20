package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cls {
	public static void main(String[] args) {
        // Initialize WebDriver for Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Open the login page
        driver.get("http://lms.nmit.ac.in/moodle/");
        
        // Navigate to the login page
        driver.findElement(By.linkText("Log in")).click();
        
        // Enter the username and password
        driver.findElement(By.name("username")).sendKeys("27617");
        driver.findElement(By.name("password")).sendKeys("Likith@123");
        
        // Submit the login form
        driver.findElement(By.id("loginbtn")).submit();
        
        // Close the browser after login
        driver.quit();
    }
}
