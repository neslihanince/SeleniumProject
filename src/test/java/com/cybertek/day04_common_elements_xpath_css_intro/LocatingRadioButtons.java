package com.cybertek.day04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingRadioButtons {

    public static void main(String[] args) {

        //radio buttons can be checked any usually come in group
        //that's the only attribute special about the element
        //we can use additional method called isSelected() to determine if it's checked

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        //locate the blue radio button)
        WebElement blueRadio = driver.findElement(By.id("blue"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected()); //true because its already selected
        blueRadio.click();//nothing will happen because

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();

        driver.quit();


    }
}
