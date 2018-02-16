package onliner.uper;

import onliner.uper.pages.LoginPage;
import onliner.uper.pages.UserTopicsPage;
import webdriver.BaseTest;

public class OnlinerUper extends BaseTest {
    @Override
    public void runTest() {
        new LoginPage().login("87bone@gmail.com","o 4rever");
//        new UserTopicsPage().upNextTopic();
    }
}
