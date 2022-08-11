package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class SameDayCargoDeliveryPage extends BasePage {

    public Hashtable<String, By> sameDayCargoDeliveryElements;

    public SameDayCargoDeliveryPage() {
        super();
        this.sameDayCargoDeliveryElements = new Hashtable<>();
        sameDayCargoDeliveryElements.put("same day text label", By.xpath("//p[@class='aynigun']"));
        sameDayCargoDeliveryElements.put("cosmetics and personal care tab", By.xpath("//img [@class='col-xs-12 img-responsive']"));
        sameDayCargoDeliveryElements.put("standard delivery radio button", By.cssSelector("#option-0-1"));
        sameDayCargoDeliveryElements.put("today delivery radio button", By.cssSelector("#option-0-2"));
        sameDayCargoDeliveryElements.put("tomorrow delivery radio button", By.cssSelector("#option-0-4"));
        sameDayCargoDeliveryElements.put("product price label", By.xpath("(//div[@class='price_1D8UZ'])[2]"));
        sameDayCargoDeliveryElements.put("total price label", By.xpath("//span [@class='total_price_3DhG3']"));
        this.pageElements = sameDayCargoDeliveryElements;
    }
}
