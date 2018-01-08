package steam.test.tests.forms;

import steam.test.tests.forms.tabs.BaseTab;
import steam.test.tests.forms.tabs.TopSellers;

public class StoreTabBar {
    public BaseTab tab;

    public BaseTab getTab(String tabName) {
        String tabId;
        switch (tabName) {
            case "Top Sellers":
                tabId = "tab_select_TopSellers";
                break;
            case "Лидеры продаж":
                tabId = "tab_select_TopSellers";
                break;
            default: throw new AssertionError("Unknown tab name" + tabName);
        }
        tab = new TopSellers(tabId);
        return tab;
    }
}
