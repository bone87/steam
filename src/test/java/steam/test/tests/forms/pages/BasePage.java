package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import steam.test.tests.forms.Header;
import webdriver.BaseForm;
import webdriver.elements.Button;

public abstract class BasePage extends BaseForm {

    public Header header = new Header();

    BasePage(By locator, String formTitle) {
        super(locator, formTitle);
    }


}

