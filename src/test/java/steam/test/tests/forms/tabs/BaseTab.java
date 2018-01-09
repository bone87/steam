package steam.test.tests.forms.tabs;

import org.openqa.selenium.By;
import steam.test.tests.forms.TabRows;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class BaseTab extends BaseForm {

    private final static String BTN_ELEMENT_STRING_LOCATOR = "//div[@id='%s']";
    private final String TAB_ID;
    public TabRows tabRows;

    public BaseTab(String tabId) {
        super(By.xpath(String.format(BTN_ELEMENT_STRING_LOCATOR, tabId)), String.format("tab with id=%s",tabId));
        TAB_ID = tabId;
    }

    public void selectTab(){
        new Button(By.xpath(String.format(BTN_ELEMENT_STRING_LOCATOR, TAB_ID)), String.format("tab with id=%s",TAB_ID)).clickAndWait();
        tabRows = new TabRows();
    }

}
