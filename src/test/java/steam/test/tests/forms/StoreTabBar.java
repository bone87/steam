package steam.test.tests.forms;

import steam.test.tests.forms.tabs.BaseTab;
import steam.test.tests.forms.tabs.TopSellers;

public class StoreTabBar {
    public BaseTab topSellersTab;

    public BaseTab getTopSellersTab(String tabId) {
        topSellersTab = new TopSellers(tabId);
        return topSellersTab;
    }
}
