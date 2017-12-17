package steam.test.tests.forms.tabs;

import org.openqa.selenium.By;
import steam.test.tests.forms.TabRows;
import webdriver.BaseForm;
import webdriver.elements.Button;

public abstract class BaseTab extends BaseForm {

    private final String TAB_ID;
    private final String btnElementStringLocator = "//div[@id='%s']";
    public TabRows tabRows;

    public BaseTab(String tabId) {
        super(By.xpath(String.format("//div[@id='%s']", tabId)), String.format("tab with id=%s",tabId));
        TAB_ID = tabId;
    }

    public void selectTab(){
        new Button(By.xpath(String.format(btnElementStringLocator, TAB_ID)), String.format("tab with id=%s",TAB_ID)).clickAndWait();
        tabRows = new TabRows();
    }

}
