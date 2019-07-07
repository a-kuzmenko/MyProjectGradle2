package com.it.pages;

import com.it.driver.DriverFactory;
import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected Logger log = Logger.getLogger(this.getClass().getSimpleName());
    protected static MyDriver driver = MyDriver.getMyDriver();
    //protected static JavascriptExecutor js = (JavascriptExecutor) driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
