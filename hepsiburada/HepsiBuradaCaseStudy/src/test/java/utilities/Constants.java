package utilities;

import org.openqa.selenium.By;

public interface Constants {

    By locationArea = By.xpath("//android.widget.TextView[@text='Konum']");
    By selectCity = By.xpath("//android.widget.TextView[@text='İl seçin']");
    By selectAdana = By.xpath("//android.widget.TextView[@text='Adana']");
    By selectTown = By.xpath("//android.widget.TextView[@text='İlçe seçin']");
    By selectAladag = By.xpath("//android.widget.TextView[@text='Aladağ']");
    By selectStreet = By.xpath("//android.widget.TextView[@text='Mahalle seçin']");
    By selectAkoren = By.xpath("//android.widget.TextView[@text='Akören']");
    By saveButton = By.xpath("//android.view.ViewGroup//android.widget.TextView[@text='Kaydet']");
    By popupLocation = By.xpath("//android.widget.TextView[@text='Konumunuz kaydedildi.']");
    By fansOfTech = By.xpath("//android.widget.ImageView[@content-desc=\"Son teknoloji\"]");
    By mobilePhone = By.xpath("//android.widget.ImageView[@content-desc=\"Cep Telefonu\"]");
    By infoOfLocation = By.xpath("//android.widget.TextView[@text='Adana']");
}
