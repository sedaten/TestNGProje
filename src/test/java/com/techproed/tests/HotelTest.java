package com.techproed.tests;

import com.techproed.pages.FhcTripLoginPage;
import com.techproed.pages.HotelPage;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class HotelTest extends TestBase {

    public void giris() {
        driver.get("http://fhctrip-qa.com/admin/HotelAdmin/Create");
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!" + Keys.ENTER);
    }

    @Test
    public void createTest() {
        HotelPage HotelPage = new HotelPage(driver);
        giris();
        HotelPage.kodKutusu.sendKeys("15426");
        HotelPage.nameKutusu.sendKeys("jack");
        HotelPage.adresKutusu.sendKeys("15Rue");
        HotelPage.emailKutusu.sendKeys("jack@mail");
        HotelPage.telefonKutusu.sendKeys("02523552");

        Select select = new Select(HotelPage.select);
        select.selectByIndex(2);
        HotelPage.saveButonu.click();

    }
}