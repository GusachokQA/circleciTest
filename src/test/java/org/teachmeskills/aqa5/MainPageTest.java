package org.teachmeskills.aqa5;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest {
    WebDriver driver;

    @Test
    public void openChromePage(){
        System.out.println("Selenium test has been started!");
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();


        driver = new ChromeDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }

    @Test
    public void openFirefoxPage(){
        System.out.println("Selenium test has been started!");
        DriverManagerType driverManagerType = DriverManagerType.CHROME;
        WebDriverManager.getInstance(driverManagerType).setup();


        driver = new FirefoxDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }
}
