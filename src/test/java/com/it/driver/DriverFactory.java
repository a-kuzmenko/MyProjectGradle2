package com.it.driver;

import com.it.Common.Constans;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//settings for different browsers
public class DriverFactory {
    public static WebDriver getDriver(){
        WebDriver driver;
        String name = System.getProperty("driver");
        if(name == null || "chrome".equals(name)){
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }else if("gecko".equals(name)){
            System.setProperty("webdriver.chrome.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            throw new UnsupportedOperationException();
        }

        driver.manage().window().fullscreen();
        driver.get(Constans.BASE_URL);

        return driver;
    }
}
