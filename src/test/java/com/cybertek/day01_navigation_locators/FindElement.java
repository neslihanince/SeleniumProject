package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

    public static void main(String[] args) throws InterruptedException {

        //open chrome and navigate to yahoo
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        //locate searchbox and enter selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        //enter text inside inputbox elemnet using sendKey("your text")
        searchBox.sendKeys("Selenium");
        //locate the search button and click(or submit)
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
    //  searchBtn.click();
        searchBtn.submit(); //only work with button in he form!!

        Thread.sleep(5000);

        //quit browser
        driver.quit();

    }
}
