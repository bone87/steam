package onliner.uper;

import onliner.uper.pages.LoginPage;
import onliner.uper.pages.UserTopicsPage;
import webdriver.BaseTest;

public class OnlinerUper extends BaseTest {
    @Override
    public void runTest() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new LoginPage().login("87bone@gmail.com","o 4rever");
        try {
            Thread.sleep(39000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new UserTopicsPage().upNextTopic();

    }
}
