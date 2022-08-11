package pages;

import org.openqa.selenium.By;

import java.util.Hashtable;

public class RemoteControlCarsPage extends BasePage {

    public Hashtable<String, By> remoteControlCarsElements;

    public RemoteControlCarsPage() {
        super();
        this.remoteControlCarsElements = new Hashtable<>();
        remoteControlCarsElements.put("remote control cars title", By.xpath("//*[@title='Uzaktan Kumandalı Arabalar']"));
        remoteControlCarsElements.put("other categories button", By.xpath("//a[@class='moreCategories']"));
        remoteControlCarsElements.put("drone spare parts link button", By.xpath("//*[contains(text(),'Drone Yedek Parçaları')]//parent::a"));
        remoteControlCarsElements.put("one product text", By.xpath("//span [(text()='1 ürün')]//parent::p"));
        this.pageElements = remoteControlCarsElements;
    }
}
