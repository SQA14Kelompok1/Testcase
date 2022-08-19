package com.tugas.pageObject;

import com.tugas.helper.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumHelper {

    //Number
    By buttonNumberZero = By.xpath("//button[@class='nums btn-zero btn btn-default']");
    By buttonNumberOne = By.xpath("//button[.='1']");
    By buttonNumberTwo = By.xpath("//button[.='2']");
    By buttonNumberThree = By.xpath("//button[.='3']");
    By buttonNumberFour = By.xpath("//button[.='4']");
    By buttonNumberFive = By.xpath("//button[.='5']");
    By buttonNumberSix = By.xpath("//button[.='6']");
    By buttonNumberSeven = By.xpath("//button[.='7']");
    By buttonNumberEight = By.xpath("//button[.='8']");
    By buttonNumberNine = By.xpath("//button[.='9']");
    By buttonNumberDot = By.xpath("//button[.='.']");

    //Operator
    By buttonAC = By.xpath("//button[@id='clearButton']");
    By buttonCE = By.xpath("//button[@id='deleteButton']");
    By buttonDiv = By.xpath("//button[.='/']");
    By buttonMultiple = By.xpath("//button[.='x']");
    By buttonMinus = By.xpath("//button[.='-']");
    By buttonPlus = By.xpath("//button[.='+']");
    By buttonEqual = By.xpath("//button[@id='resultButton']");

    //Screen
    By screenOutput = By.xpath("//div[@id='output']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed(){
        return driver.findElement(buttonAC).isDisplayed();
    }

    public String getOutput(){
        return driver.findElement(screenOutput).getText();
    }

    public HomePage clear(){
        driver.findElement(buttonAC).click();
        return this;
    }

    public HomePage deleteLastEntry(){
        driver.findElement(buttonCE).click();
        return this;
    }

    public void buttonResult(){
        driver.findElement(buttonEqual).click();
    }

    public HomePage clickNumberCalculator(String num){
        if (num.equals("0")){
            driver.findElement(buttonNumberZero).click();
        } else if (num.equals("1")) {
            driver.findElement(buttonNumberOne).click();
        } else if (num.equals("2")) {
            driver.findElement(buttonNumberTwo).click();
        } else if (num.equals("3")) {
            driver.findElement(buttonNumberThree).click();
        } else if (num.equals("4")) {
            driver.findElement(buttonNumberFour).click();
        } else if (num.equals("5")) {
            driver.findElement(buttonNumberFive).click();
        } else if (num.equals("6")) {
            driver.findElement(buttonNumberSix).click();
        } else if (num.equals("7")) {
            driver.findElement(buttonNumberSeven).click();
        } else if (num.equals("8")) {
            driver.findElement(buttonNumberEight).click();
        } else if (num.equals("9")) {
            driver.findElement(buttonNumberOne).click();
        } else if (num.equals(".")) {
            driver.findElement(buttonNumberDot).click();
        }
        return this;
    }

    public HomePage clickOperator(String operator){
        if (operator.equals("/")){
            driver.findElement(buttonDiv).click();
        } else if (operator.equals("x")) {
            driver.findElement(buttonMultiple).click();
        } else if (operator.equals("-")) {
            driver.findElement(buttonMinus).click();
        } else if (operator.equals("+")) {
            driver.findElement(buttonPlus).click();
        } else if (operator.equals("=")) {
            driver.findElement(buttonEqual).click();
        } else if (operator.equals("AC")) {
            driver.findElement(buttonAC).click();
        } else if (operator.equals("CE")) {
            driver.findElement(buttonCE).click();
        }
        return this;
    }

}
