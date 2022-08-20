package com.kalkulator;


import Kalkulator.MainPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestCase extends BaseTest{

    @Test
    public void TC1Pembagian() {
        MainPage mainPage = new MainPage(webdriver);

        mainPage.num1();
        mainPage.num2();
        mainPage.num1();
        mainPage.num5();
        mainPage.div();
        mainPage.num5();
        mainPage.result();

        assertEquals("243",mainPage.scr1());
        assertEquals("243",mainPage.scr2());

        mainPage.btnCE();
        assertEquals("24",mainPage.scr1());
        assertEquals("24",mainPage.scr2());

        mainPage.btnAC();
        assertEquals("0",mainPage.scr1());
        assertEquals("",mainPage.scr2());

    }







}
