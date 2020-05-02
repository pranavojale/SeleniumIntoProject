package com.ojale.pranav.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFirefox {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
    }
}
