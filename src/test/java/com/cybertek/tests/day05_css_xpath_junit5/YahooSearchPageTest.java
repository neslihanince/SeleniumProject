package com.cybertek.tests.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class YahooSearchPageTest {
    //instance msg
    WebDriver driver ;


    @BeforeEach
    public void setWebUpDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @AfterAll
    public static void teardown(){
        System.out.println("AfterAll , nothing do the here");
    }


    //write 2 test :
    //testYahooSearchPageTitle
    //test When you navigate to yahoo search page
    //the title should be "Yahoo Search-Web Search"

    @Test
    public void testYahooSearchResultPage(){

        driver.get("https://search.yahoo.com/");

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        //quit the browser here, because we already saved the title
        driver.quit();
        //do static import so you can do this
        //import static org.junit.jupiter.api.Assertions.*;

        assertEquals(expectedTitle,actualTitle);


    }

    //test method name : testYahooSearchResultPageTitle
    //test navigate to yahoo page
    //and search for selenium
    //the page title should start with selenium

    @Test
    public void testYahooSearchResultPageTitle(){

        driver.get("https://search.yahoo.com/");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p']"));
        //We can simulate keystroke using Keys.SELECT_ONE_OF_THE_OPTION
        //IN this case we are typing selenium and hitter ener
        searchBox.sendKeys("Selenium" + Keys.ENTER);

        //String expectedTitleStarWith = "Selenium";
        String actualTitle = driver.getTitle();

        driver.quit();

        assertTrue(actualTitle.startsWith("Selenium"));


    }
}
