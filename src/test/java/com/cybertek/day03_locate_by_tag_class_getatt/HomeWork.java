package com.cybertek.day03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomeWork {

    public static void main(String[] args) {

        //navigate
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        //search for selenium
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        //click google search button
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        searchBtn.submit();
        //identify the div that hold the search result count on next page About 108,000,000 results (0.67 seconds)
        WebElement searchResult = driver.findElement(By.id("result-stats"));
        String result = searchResult.getText();
        List<WebElement> allLinks = driver.findElements(By.partialLinkText("Selenium"));
        System.out.println("allLinks.size() = " + allLinks.size());
        WebElement firstItem = allLinks.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());
        WebElement lastItem = allLinks.get(allLinks.size()-1);
        System.out.println("lastItem.getText() = " + lastItem.getText());
        for (WebElement eachElement : allLinks){
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }
        driver.navigate().back();

        driver.quit();




    }


}
