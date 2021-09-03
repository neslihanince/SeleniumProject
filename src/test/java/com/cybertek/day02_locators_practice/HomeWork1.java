package com.cybertek.day02_locators_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork1 {

    public static void main(String[] args)throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        Thread.sleep(3000);
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        System.out.println("searchResult.getText() = " + searchResult.getText());
        List<WebElement> allLinks = driver.findElements(By.partialLinkText("Selenium"));
        System.out.println("allLinks.size() = " + allLinks.size());
        WebElement firstText = allLinks.get(0);
        System.out.println("firstText.getText() = " + firstText.getText());
        WebElement lastText = allLinks.get(allLinks.size()-1);
        System.out.println("lastText.getText() = " +firstText.getText());
        for (WebElement eachElement : allLinks){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }
        Thread.sleep(3000);
        driver.navigate().back();
        List<WebElement> tagList = driver.findElements(By.name("a"));
        for (WebElement eachTagList : tagList){
            System.out.println("eachTagList.getText() = " + eachTagList.getText());
        }
        Thread.sleep(3000);
        driver.quit();


    }

}