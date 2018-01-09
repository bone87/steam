package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class Header extends BaseForm {

    public Header() {
        super(By.xpath("//div[@id='global_header']"),"header");
    }

    public void clickButton(String buttonName){
        String buttonStringLocator = "//a[contains(text(),'%s')]";
        new Button(By.xpath(String.format(buttonStringLocator, buttonName)), buttonName).clickAndWait();

    }
}
