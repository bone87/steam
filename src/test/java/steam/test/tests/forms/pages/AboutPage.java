package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import webdriver.elements.Button;

public class AboutPage extends BasePage {

    public AboutPage() {
        super(By.xpath("//div[@id='about_header_ctn']"), "about page");
    }

    public void selectElement(String elementName){
        String btnElementStringLocator = "//div[@id='about_greeting_ctn']//span[text()='%s']";
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).clickAndWait();
    }

}
