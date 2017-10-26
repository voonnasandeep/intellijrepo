package com.pluralsight;

/**
 * Hello world!
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class App 
{
    public static void main( String[] args ) throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("http://www.google.com");
        WebElement searchField = driver.findElement(By.id("lst-ib"));
        searchField.sendKeys("Billa");
        searchField.submit();
        WebElement imageButton = driver.findElement(By.linkText("Images"));
        imageButton.click();
        WebElement imageText = driver.findElements(By.cssSelector("a[class=rg_l]")).get(4);
        WebElement actualImage = driver.findElement(By.tagName("img"));
        //actualImage.click();
    }
}

