package com.tugas;


import com.tugas.pageObject.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class SeleniumCalculatorTest extends BaseTest {

    @Test
    public void testCalculatorAC() {
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());
        homePage
                .clickNumberCalculator("0").clickNumberCalculator("1").clickNumberCalculator("2")
                .clickNumberCalculator("3").clickNumberCalculator("4").clickNumberCalculator("5")
                .clickNumberCalculator("6").clickNumberCalculator("7").clickNumberCalculator("8")
                .clickNumberCalculator("9")
                .clear()
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("0",actualResult);
    }

    @Test
    public void testCalculatorCE() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickNumberCalculator("1")
                .clickNumberCalculator("2")
                .deleteLastEntry()
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("1",actualResult);
    }

    @Test
    public void testCalculatorPlus() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickNumberCalculator("1").clickNumberCalculator("0").clickOperator("+")
                .clickNumberCalculator("2").clickNumberCalculator("0").clickOperator("+")
                .clickNumberCalculator("3").clickNumberCalculator("0")
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("60",actualResult);
    }

    @Test
    public void testCalculatorMinus() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickNumberCalculator("3").clickNumberCalculator("0").clickOperator("-")
                .clickNumberCalculator("2").clickNumberCalculator("0").clickOperator("-")
                .clickNumberCalculator("5")
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("5",actualResult);
    }

    @Test
    public void testCalculatorDivision() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickNumberCalculator("6").clickNumberCalculator("0").clickOperator("/")
                .clickNumberCalculator("3").clickNumberCalculator("0").clickOperator("/")
                .clickNumberCalculator("2")
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("1",actualResult);
    }

    @Test
    public void testCalculatorMultiply() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickNumberCalculator("2").clickNumberCalculator("0").clickOperator("x")
                .clickNumberCalculator("2").clickOperator("x").clickNumberCalculator("2")
                .buttonResult();
        String actualResult = homePage.getOutput();
        Assert.assertEquals("80",actualResult);
    }

}
