package com.zhentao.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainFirefox {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "http://www.openx.com";
        driver.get(baseUrl);

        driver.findElement(By.linkText("Support")).click();
        driver.close();
    }
}
