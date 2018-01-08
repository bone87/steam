package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.elements.Button;

public class PopupNavMenu {

    public void selectElement(String elementName){
        String btnElementStringLocator = "//div[@id='store_nav_area']//a[@class='popup_menu_item' and contains(text(),'%s')]";
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).clickAndWait();
    }


}
