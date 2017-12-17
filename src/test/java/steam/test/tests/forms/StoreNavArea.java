package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class StoreNavArea extends BaseForm {

    private final String btnElementStringLocator = "//div[@id='store_nav_area']//a[@class='pulldown_desktop' and text()='%s']";
    public PopupNavMenu popupNavMenu;

    public StoreNavArea() {
        super(By.xpath("//div[@id='store_nav_area']"), "store nav menu");
    }

    public void moveToElement(String elementName){
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).moveMouseToElement();
        popupNavMenu = new PopupNavMenu();
    }
}
