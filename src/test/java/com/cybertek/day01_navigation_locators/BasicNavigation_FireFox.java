package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_FireFox {

    public static void main(String[] args) {

        //set up FireFox driver
        WebDriverManager.firefoxdriver().setup();

        //create Webdriver instance using FirefoxDriver object
        WebDriver driver = new FirefoxDriver();

        //navigate to "https://cybertekschool.com

    }
}
