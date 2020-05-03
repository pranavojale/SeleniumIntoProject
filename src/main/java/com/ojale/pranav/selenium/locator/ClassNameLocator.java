package com.ojale.pranav.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com");

        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("12345");
        //driver.findElement((By.className("button r4 wide primary"))).click(); // Gives Error Compound class name not permitted

        driver.get("http://facebook.com");

        // Selenium will select first element having class name
        driver.findElement(By.className("inputtext")).sendKeys("12345");
    }
}
