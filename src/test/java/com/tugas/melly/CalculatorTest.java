package com.tugas.melly;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest extends BaseTest{

    @Test
    public void testCalculator() throws InterruptedException {
        CalculatorPageObject calculator = new CalculatorPageObject(driver);

        // verify calculator is loaded
        Assert.assertTrue(calculator.isDisplayed());

        // verify button number clickable
        List<Integer> listNumber = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        for(Integer number : listNumber) {
            calculator.clickNumber(number);
        }
        Assert.assertEquals("1234567890", calculator.getMainScreen());
        Assert.assertEquals("1234567890", calculator.getSubScreen());

        // verify delete
        calculator.clickOperator("ce");
        Assert.assertEquals("123456789", calculator.getMainScreen());
        Assert.assertEquals("123456789", calculator.getSubScreen());

        // verify clear all
        calculator.clickOperator("ac");
        Assert.assertEquals("0", calculator.getMainScreen());
        Assert.assertEquals("", calculator.getSubScreen());

        // verify addition
        calculator.clickNumber(1).clickNumber(2).clickOperator("+").clickNumber(9).clickOperator("=");
        int expectedResultAdd = 12+9;
        Assert.assertEquals(String.valueOf(expectedResultAdd), calculator.getMainScreen());
        calculator.clickOperator("ac");

        // verify substraction
        calculator.clickNumber(3).clickNumber(6).clickOperator("-").clickNumber(7).clickOperator("=");
        int expectedResultMinus = 36-7;
        Assert.assertEquals(String.valueOf(expectedResultMinus), calculator.getMainScreen());
        calculator.clickOperator("ac");

        // verify division
        calculator.clickNumber(2).clickNumber(7).clickOperator("/").clickNumber(3).clickOperator("=");
        int expectedResultDiv = 27/3;
        Assert.assertEquals(String.valueOf(expectedResultDiv), calculator.getMainScreen());
        calculator.clickOperator("ac");

        // verify multiplication
        calculator.clickNumber(5).clickNumber(4).clickOperator("x").clickNumber(1).clickNumber(3).clickOperator("=");
        int expectedResultTime = 54*13;
        Assert.assertEquals(String.valueOf(expectedResultTime), calculator.getMainScreen());
        calculator.clickOperator("ac");
    }
}
