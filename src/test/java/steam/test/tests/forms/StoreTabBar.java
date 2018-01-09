package steam.test.tests.forms;

import steam.test.tests.forms.tabs.BaseTab;

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
        tab = new BaseTab(tabId);
        return tab;
    }
}
