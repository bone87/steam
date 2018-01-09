package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import steam.test.tests.forms.StoreNavArea;

public abstract class BasePageWithNav extends BasePage {

    public StoreNavArea navArea = new StoreNavArea();

    BasePageWithNav(By locator, String formTitle) {
        super(locator, formTitle);
    }
}
