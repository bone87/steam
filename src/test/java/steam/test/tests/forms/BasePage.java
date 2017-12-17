package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public abstract class BasePage extends BaseForm {

    public Header header = new Header();

    public BasePage(By locator, String formTitle) {
        super(locator, formTitle);
    }


}

