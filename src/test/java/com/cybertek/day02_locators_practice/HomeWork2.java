package com.cybertek.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

    public static void main(String[] args)throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://zero.webappsecurity.com/");
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero - Personal Banking - Loans - Credit Cards ";
        if (actualTitle.equals(expectedTitle)){
            driver.navigate().refresh();
        }else {
            driver.quit();
        }
        Thread.sleep(3000);
        WebElement signInBtn =driver.findElement(By.id("signin_button"));
        signInBtn.click();
        String expectedTitle2 = "Zero - log in";
        if (actualTitle.equals(expectedTitle2)){
            driver.navigate().refresh();
        }else {
            driver.quit();
        }
        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.id("user_login"));
        userName.sendKeys("username");
        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("password");
        WebElement signIn = driver.findElement(By.name("submit"));
        signIn.submit();
        String expectedTitle3 = "Zero - Account summary";
        if (actualTitle.equals(expectedTitle3)){
            driver.navigate().refresh();
        }else {
            driver.quit();
        }
        Thread.sleep(3000);

        driver.quit();

    }
}