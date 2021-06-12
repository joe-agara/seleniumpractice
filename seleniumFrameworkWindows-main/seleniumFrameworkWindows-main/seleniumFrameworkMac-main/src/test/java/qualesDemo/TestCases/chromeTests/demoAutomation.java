package qualesDemo.TestCases.chromeTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import qualesDemo.DriverFactory.chrome;


public class demoAutomation {
    public WebDriver driver;
    public String baseURL = "https://web.facebook.com/?_rdc=1&_rdr";


    @Test
    public void login() {
        //Open Browser

        System.out.println("Opening chrome browser");

        //Choose Chrome
        driver = chrome.open();

        driver.manage().window().maximize();
        driver.get(baseURL);

    }


    }


