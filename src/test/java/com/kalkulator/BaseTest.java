package com.kalkulator;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver webdriver;

    @Before
    public  void openBrowser (){
        System.setProperty("webdriver.chrome.driver","F:\\QA\\WebDriver\\chromedriver.exe");
        webdriver = new ChromeDriver();

        webdriver.get("https://greyli.github.io/calculator/");
        webdriver.manage().window().maximize();
    }

    @After
    public void closeBrowser(){webdriver.quit();}
}
