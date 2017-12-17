package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class Header extends BaseForm {

    private final String BUTTON_STRING_LOCATOR = "//a[contains(text(),'%s')]";
    public Header() {
        super(By.xpath("//div[@id='global_header']"),"header");
    }

    public Button getButton(String buttonName){
        return new Button(By.xpath(String.format(BUTTON_STRING_LOCATOR, buttonName)), buttonName);

    }
}
