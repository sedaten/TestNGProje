package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JSAlertTest {


    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void jsAlertTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        // <button onclick="jsAlert()">Click for JS Alert</button>
        // xpath, cssSelector, tagName
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        button.click();
        // alert'in içerdiği mesajı almak için getText kullanırız.
        String alertMesaji = driver.switchTo().alert().getText();
        System.out.println(alertMesaji);
        // alert'in içerisindeli "okay" butonuna tıklamak için kullanılır.
        driver.switchTo().alert().accept();
    }
    @Test
    public void jsConfirmTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //<button onclick="jsConfirm()">Click for JS Confirm</button>
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        button.click();
        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);
        // alert'in içerisindeki "Cancel" butonuna tıklar.
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void jsPromptTest(){
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //<button onclick="jsPrompt()">Click for JS Prompt</button>
        WebElement button = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        button.click();
        String mesaj = driver.switchTo().alert().getText();
        System.out.println(mesaj);
        driver.switchTo().alert().sendKeys("Merhaba TestNG");
        driver.switchTo().alert().accept();
    }
}