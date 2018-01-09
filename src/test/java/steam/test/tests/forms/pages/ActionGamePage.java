package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import steam.test.tests.forms.StoreTabBar;

public class ActionGamePage extends BasePageWithNav {

    public StoreTabBar storeTabBar = new StoreTabBar();

    public ActionGamePage() {
        super(By.xpath("//div[@id='tab_select_NewReleases']"), "page for action games");
    }

}
