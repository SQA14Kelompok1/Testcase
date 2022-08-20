package Kalkulator;

import kalkulatorHelper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends Helper {
    By satu = By.xpath("//button[.='1']");
    By dua = By.xpath("//button[.='2']");
    By tiga = By.xpath("//button[.='3']");
    By empat = By.xpath("//button[.='4']");
    By lima = By.xpath("//button[.='5']");
    By enam = By.xpath("//button[.='6']");
    By tujuh = By.xpath("//button[.='7']");
    By delapan = By.xpath("//button[.='8']");
    By sembilan = By.xpath("//button[.='9']");
    By bagi = By.xpath("//button[.='/']");
    By kali = By.xpath("//button[.='*']");
    By tambah = By.xpath("//button[.='+']");
    By kurang = By.xpath("//button[.='-']");
    By hasil = By.id("resultButton");
    By mainScreen = By.id("output");
    By subScreen = By.id("output2");
    By clear = By.id("clearButton");
    By delete = By.id("deleteButton");

    public MainPage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    public void num1(){driver.findElement(satu).click();}
    public void num2(){driver.findElement(dua).click();}
    public void num3(){driver.findElement(tiga).click();}
    public void num4(){driver.findElement(empat).click();}
    public void num5(){driver.findElement(lima).click();}
    public void num6(){driver.findElement(enam).click();}
    public void num7(){driver.findElement(tujuh).click();}
    public void num8(){driver.findElement(delapan).click();}
    public void num9(){driver.findElement(sembilan).click();}
    public void div(){driver.findElement(bagi).click();}
    public void mult(){driver.findElement(kali).click();}
    public void plus(){driver.findElement(tambah).click();}
    public void minus(){driver.findElement(kurang).click();}
    public void result(){driver.findElement(hasil).click();}
    public void btnAC(){driver.findElement(clear).click();}
    public void btnCE(){driver.findElement(delete).click();}

    public String scr1(){return driver.findElement(mainScreen).getText();}
    public String scr2(){return driver.findElement(subScreen).getText();}


}
