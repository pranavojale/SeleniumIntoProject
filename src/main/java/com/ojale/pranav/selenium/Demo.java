package com.ojale.pranav.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.get("http://yahoo.com");

        driver.navigate().back();

        driver.close(); // It closes current browser
        driver.quit(); // It closes all the browsers opened by selenium script
    }
}
