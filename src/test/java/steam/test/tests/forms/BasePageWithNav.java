package steam.test.tests.forms;

import org.openqa.selenium.By;

public abstract class BasePageWithNav extends BasePage {

    public StoreNavArea navArea = new StoreNavArea();

    BasePageWithNav(By locator, String formTitle) {
        super(locator, formTitle);
    }
}
