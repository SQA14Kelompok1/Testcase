package com.tugas.melly;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://greyli.github.io/calculator/");
    }

    @After
    public void closeWebBrowser(){
        System.out.println("Test Passed");
        driver.quit();
    }
}
