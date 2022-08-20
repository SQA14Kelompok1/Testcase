package com.tugas.melly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPageObject extends Helper {

    //Number
    By zero = By.xpath("//button[@class='nums btn-zero btn btn-default']");
    By one = By.xpath("//button[.='1']");
    By two = By.xpath("//button[.='2']");
    By three = By.xpath("//button[.='3']");
    By four = By.xpath("//button[.='4']");
    By five = By.xpath("//button[.='5']");
    By six = By.xpath("//button[.='6']");
    By seven = By.xpath("//button[.='7']");
    By eight = By.xpath("//button[.='8']");
    By nine = By.xpath("//button[.='9']");
    By dot = By.xpath("//button[.='.']");

    //Operator
    By clear = By.xpath("//button[@id='clearButton']");
    By delete = By.xpath("//button[@id='deleteButton']");
    By divide = By.xpath("//button[.='/']");
    By time = By.xpath("//button[.='x']");
    By minus = By.xpath("//button[.='-']");
    By plus = By.xpath("//button[.='+']");
    By equal = By.xpath("//button[@id='resultButton']");

    //Screen
    By screen = By.xpath("//div[@class='screen']");
    By mainScreen = By.xpath("//div[@id='output']");
    By subScreen = By.xpath("//div[@id='output2']");

    public CalculatorPageObject(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayed(){
        return verifyElement(screen);
    }

    public CalculatorPageObject clickNumber(Integer number) {
        switch (number) {
            case 0:
                click(zero);
                break;
            case 1:
                click(one);
                break;
            case 2:
                click(two);
                break;
            case 3:
                click(three);
                break;
            case 4:
                click(four);
                break;
            case 5:
                click(five);
                break;
            case 6:
                click(six);
                break;
            case 7:
                click(seven);
                break;
            case 8:
                click(eight);
                break;
            case 9:
                click(nine);
                break;
        }
        return this;
    }

    public CalculatorPageObject clickOperator(String operator) {
        switch (operator) {
            case "ac":
                click(clear);
                break;
            case "ce":
                click(delete);
                break;
            case "/":
                click(divide);
                break;
            case "x":
                click(time);
                break;
            case "-":
                click(minus);
                break;
            case "+":
                click(plus);
                break;
            case "=":
                click(equal);
                break;
        }
        return this;
    }

    public String getMainScreen() {
        return getText(mainScreen);
    }

    public String getSubScreen() {
        return getText(subScreen);
    }
}
