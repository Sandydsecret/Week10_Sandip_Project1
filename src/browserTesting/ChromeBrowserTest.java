package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        //launch the chrome
        WebDriver driver = new ChromeDriver();
        //open URL
        driver.get(baseurl);
        //maximise browser
        driver.manage().window().maximize();
        //print the title of the page
        System.out.println("Title :"+ driver.getTitle());
        //Print the current URL
        System.out.println("Current URL : "+driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page Source : "+driver.getPageSource());
        // Enter the email to eamil fiels
        driver.findElement(By.id("Email")).sendKeys("sandydsecret@gmail.com");
        //Enter the passowrd to password field
        driver.findElement(By.id("Password")).sendKeys("Sandy@1255");
        //close the browser
        driver.close();


    }
}
