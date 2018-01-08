package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.elements.Button;

public class AboutPage extends BasePage {
    private final String btnElementStringLocator = "//div[@id='about_greeting_ctn']//span[text()='%s']";

    public AboutPage() {
        super(By.xpath("//div[@id='about_header_ctn']"), "about page");
    }

    public void selectElement(String elementName){
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).clickAndWait();
    }

}
