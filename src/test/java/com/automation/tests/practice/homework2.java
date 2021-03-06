package com.automation.tests.practice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class homework2 {


    private String URL = "http://practice.cybertekschool.com/registration_form";
    private WebDriver driver;
    //private By dateOfBirthBy = By.xpath("//input[@placeholder='MM/DD/YYYY']");
    private By dateOfBirthBy = By.name("birthday");
    @Test
    public void registrationForm() throws InterruptedException {
        driver.findElement(dateOfBirthBy).sendKeys("01");
        Thread.sleep(5000);
        WebElement warningMessage = driver.findElement(By.xpath("//small[contains(text(),'The date of birth is not valid')]"));
        Thread.sleep(5000);
        Assert.assertTrue(warningMessage.isDisplayed());
        Thread.sleep(5000);
        System.out.println(warningMessage);
    }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
