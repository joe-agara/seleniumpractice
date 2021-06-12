package qualesDemo.TestCases.chromeTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import qualesDemo.DriverFactory.chrome;


public class demoAutomation2 {
    public WebDriver driver;
    public String baseURL = "https://web.facebook.com/?_rdc=1&_rdr";


    @Test
    public void login() {
        //Open Browser

        System.out.println("Open chrome browser");

        //Choose Chrome
        driver = chrome.open();

        driver.manage().window().maximize();

        //Open Facebook
        driver.get(baseURL);



        

    }


    }


