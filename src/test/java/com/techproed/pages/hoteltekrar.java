package com.techproed.pages;

public class hoteltekrar {
    /*
    HOTEL GIRIS PROJESI
utilities package icine TestBase classi olusturun.
test package icinde HotelGirisTest classi olusturun
pages package icinde HotelGirisPage classi olusturun
HotelGirisPage classinda driver icin constructor olusturun
HotelGirisTesti icinde Test olusturun
            "http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin" adresine gidin.
Bu adresteki "UserName" "Password" ve "LOG IN" webelementlerini HotelGirisPage classina uygun olarak bulun.
HotelGirisTestinde HotelGirisPage classindan object uretin
object ile UserName    = Manager2       Password    = man1ager2!  degerlerini gonderin. ve LOG IN e tiklayin
**************************************************************************************************************
HOTEL OLUSTURMA PRJESI
tests package icinde HotelOlusturmaTest classi olusturun
Projenin icinde "configuration.properties" adinda file olusturun
Bu file icine "http://fhctrip-qa.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin" hotel giris  adresini
               "http://fhctrip-qa.com/admin/HotelAdmin/Create" hotel olusturma adresini
               "manager2"  usernameini ve
                Man1ager2! passwordunu kaydedin.
utilities package icinde ConfigurationReader classi olusturun
FileInputStream classiyla configuration.properties file'ini actiralim
Properties classindan nesne olusturup file'i load() methoduyla okutalim.
ConfigurationReader classinda getProperty(String key) methodu olusturun
pages sayfasinda HotelOlusturmaPage sayfasini ve uygun constructorini olusturun.
bu sayfada "UserName" "Password" "LOG IN" webelementlerini bulun
HotelOlusturmaTest classi icinde giris() methodunu ConfigurationReader kullanarak olusturun sonra hotelOlusturma() methodunu olusturun ve adrese gidin.
Bu adresteki doldurulmasi veya secilmesi gereken webelementleri bulup dogru class icine kaydedin.
ConfigurationReader classi ve diger gereklli classlar ile bir hotel olusturun.
Assert ile olusup olusmadigini test edin.
****************************************************************************************************
HOTEL ROOM OLUSTURMA
dogru package lerde HotelRoomPage ve HotelRoomTest classlarini olusturun.
HotelRoomPage classinda gerekli constructoru olusturun.
HotelRoomTest classinda hotele giris methodunu olusturun ve "http://fhctrip-qa.com/admin/HotelroomAdmin/Create" adresine gidin
bu sayfadaki secilmesi veya doldurulmasi gereken Webelementleri bulun ve dogru classa kaydedin.
HotelRoomTest sayfasinda gerekli method veya objectleri olusturun(Select,Actions,switchTo(),moveToElement(),dragAndDrop() vb.)
yazi bolumune Merhaba Dunya yazdirin.
price bolmunu herhangi bir ucretle doldurun.
room u kaydedin.

     */
}
