package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public abstract class BasePage extends BaseForm {

    public Header header = new Header();
    protected String btnElementStringLocator;
    public BasePage(By locator, String formTitle) {
        super(locator, formTitle);
    }

    public void selectElement(String elementName){
        new Button(By.xpath(String.format(btnElementStringLocator, elementName)), String.format("element: %s", elementName)).clickAndWait();
    }

}

