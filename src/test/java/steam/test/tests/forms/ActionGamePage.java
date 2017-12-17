package steam.test.tests.forms;

import org.openqa.selenium.By;

public class ActionGamePage extends BasePageWithNav {

    public StoreTabBar storeTabBar = new StoreTabBar();

    public ActionGamePage() {
        super(By.xpath("//div[@id='tab_select_NewReleases']"), "page for action games");
    }

}
