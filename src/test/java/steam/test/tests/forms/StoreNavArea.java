package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class StoreNavArea extends BaseForm {
    private static final String NAV_AREA_STRING_LOCATOR = "//div[@id='store_nav_area']";
    public PopupNavMenu popupNavMenu;

    public StoreNavArea() {
        super(By.xpath(NAV_AREA_STRING_LOCATOR), "store nav menu");
    }

    public void moveToElement(String elementName){
        String btnElementStringLocator = NAV_AREA_STRING_LOCATOR + "//a[@class='pulldown_desktop' and text()='%s']";
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).moveMouseToElement();
        popupNavMenu = new PopupNavMenu();
    }
}
