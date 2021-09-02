package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

    public static void main(String[] args) {

        //open chrome and navigate to yahoo
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");

        //identify yahoo search box by it's name attribute
        WebElement searchBox = driver.findElement(By.name("p"));
        searchBox.sendKeys("Selenium");
        //locate and click on the button
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        //any button can be clicked,
        //the buttons to submit the form can use submit method
        searchBtn.submit();

        //driver closet
        driver.quit();



    }
}
