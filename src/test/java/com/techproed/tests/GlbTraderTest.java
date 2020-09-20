package com.techproed.tests;

import com.techproed.pages.GlbTraderPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBase;
import com.techproed.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbTraderTest extends TestBaseFinal {

    @Test
    public void urunIsmiVeSayfaTitleKarsilastirmaTesti(){
        extentTest = extentReports.createTest("baslik karşılaştırma",
                "ürün ismi ve sayfa başlığını karşılaştıralım.");
        extentTest.info("Sayfa adresine gidelim.");

        Driver.getDriver().get(ConfigurationReader.getProperty("glb_search"));
        extentTest.info("GlbTraderPage nesnesi üretlim.");

        GlbTraderPage glbTraderPage = new GlbTraderPage();
        extentTest.info("Select nesnesi üretelim.");

        Select select = new Select(glbTraderPage.kategorilerDropDown);
        select.selectByIndex(6);
        extentTest.info("Arama kutusuna kelime yazalım.");

        glbTraderPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("glb_kelime") + Keys.ENTER);
        extentTest.info("2. sıradaki ürünün ismini aldık.");

        String urunIsmi = glbTraderPage.sonuclarListe.get(1).getText();
        extentTest.info("2. sıradaki ürüne tıkladık.");

        glbTraderPage.sonuclarListe.get(1).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        extentTest.info("Sayfa başlığını aldık.");

        String sayfaBasligi = Driver.getDriver().getTitle();
        extentTest.info("Assert işlemi yapalım.");

        Assert.assertEquals(urunIsmi , sayfaBasligi);
        extentTest.pass("Testimiz PASSED !");
    }
}


