//package com.seleniumProj;
//import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.openmbean.ArrayType;
import javax.xml.xpath.XPath;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.InvalidSelectorException;
public class mainClass{

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/p0028867/Downloads/chromeFolder/chromedriver.exe");

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://www.google.com");
//        WebDriverWait waitForElems = new WebDriverWait(driver,40);
//        WebElement inutBoxElem= driver.findElement(By.id("realbox"));
//        WebElement searchButtonElem = driver.findElement(By.id("realbox-icon"));
//        waitForElems.wait();
//        inutBoxElem.sendKeys("Ynet");
//
//        searchButtonElem.click();

    }
}
