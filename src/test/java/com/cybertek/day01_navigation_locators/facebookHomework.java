package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookHomework {

    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        WebElement usernameBox = driver.findElement(By.name("email"));
        usernameBox.sendKeys("Neslihan");
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("Password1223");
        WebElement loginBox = driver.findElement(By.name("login"));
        loginBox.click();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement forgetPassword = driver.findElement(By.linkText("forget password"));
        forgetPassword.click();
        Thread.sleep(3000);
        WebElement phoneNumber = driver.findElement(By.id("identify_email"));
        phoneNumber.sendKeys("7382648920");
        Thread.sleep(3000);
        WebElement searchBtn = driver.findElement(By.name("did_submit"));
        searchBtn.submit();
        Thread.sleep(3000);
        WebElement cancelBtn = driver.findElement(By.linkText("Cancel"));
        cancelBtn.click();
        driver.quit();

    }
}
