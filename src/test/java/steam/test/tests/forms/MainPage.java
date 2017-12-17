package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.elements.Button;

public class MainPage extends BasePageWithNav{

    private final String btnElementStringLocator = "//div[@id='store_nav_area']//a[@class='pulldown_desktop' and text()='%s']";

    public MainPage() {
        super(By.xpath("//div[@id='home_maincap_v7']"), "main page");

    }
    public void selectElement(String elementName){
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).clickAndWait();
    }

}
