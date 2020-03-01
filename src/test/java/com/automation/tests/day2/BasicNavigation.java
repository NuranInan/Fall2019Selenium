package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class BasicNavigation {

    public static void main(String[] args) throws Exception {
        //to start selenium script we need :
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        //In selenium, everything starts from WebDriver interface
        //ChromeDriver extends RemoteWebDriver-->implements WebDriver
        driver.get("http://google.com");//to open a website

        Thread.sleep(3000);//for demo wait 3 seconds

        driver.close();//to close browser
    }
}