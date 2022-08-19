package com.tugas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
    public WebDriver driver;
//    public WebDriverWait wait; // optional

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://greyli.github.io/calculator/");
        driver.manage().window().maximize();
    }

    @After
    public void closeWebBrowserr(){
        System.out.println("Test Passed");
        driver.quit();
    }
}
