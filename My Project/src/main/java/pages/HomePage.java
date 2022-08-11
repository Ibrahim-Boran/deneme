package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class HomePage extends BasePage {

    public Hashtable<String, By> homeElements;

    public HomePage() {
        super();
        this.homeElements = new Hashtable<>();
//        homeElements.put("sign in title", By.xpath("//*[@title='Giriş Yap']"));
//        homeElements.put("login button", By.xpath("//*[@id=\"login\"]"));
//        homeElements.put("search input box", By.xpath("//input[@class='desktopOldAutosuggestTheme-input']"));
//        homeElements.put("search button", By.xpath("//div[@class='SearchBoxOld-buttonContainer']"));
//        homeElements.put("my account title", By.xpath("(//*[@title='Hesabım'])[1]"));
//        homeElements.put("book, music, movie, hobby category title", By.xpath("//*[(text()='Kitap, Müzik, Film, Hobi')]//parent::span"));
//        homeElements.put("remote control vehicles link button", By.xpath("//*[(text()='Uzaktan Kumandalı Araçlar')]//parent::a"));
//        homeElements.put("delivery today title", By.xpath("//*[@title='Bugün Teslimat']"));
//        homeElements.put("details button", By.xpath("//a[@class='sf-DeliveryTooltip-2zrc0']//parent::div"));
          homeElements.put("Search", By.xpath("//input[@name='search_query']"));
          homeElements.put("Music", By.xpath("//*[@title='Music']"));
          homeElements.put("Explore", By.xpath("//a[@title='Explore']"));
        homeElements.put("Home", By.xpath("//a[@title='Home']"));

        this.pageElements = homeElements;
    }
}
