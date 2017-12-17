package steam.test.tests;

import steam.test.tests.forms.AboutPage;
import steam.test.tests.forms.ActionGamePage;
import steam.test.tests.forms.MainPage;
import steam.test.tests.forms.GameWithDiscountPage;
import steam.test.tests.models.Game;
import steam.test.tests.utils.FileUtils;
import steam.test.tests.utils.Localler;
import webdriver.BaseTest;
import webdriver.BrowserFactory;
import webdriver.PropertiesResourceManager;

import java.util.concurrent.TimeUnit;

public class SteamTest extends BaseTest {
    private final String STEAM_PROPERTIES_FILE = "steam_project.properties";
    private final PropertiesResourceManager PROPS = new PropertiesResourceManager(STEAM_PROPERTIES_FILE);
    private PropertiesResourceManager locale_props;

    @Override
    public void runTest() throws InterruptedException {
        locale_props =  new PropertiesResourceManager(Localler.getLocaleDictionary());

        logger.step(2);
        MainPage mainPage = new MainPage();
        mainPage.navArea.moveToElement(locale_props.getProperty(PROPS.getProperty("move_to_element")));
        mainPage.navArea.popupNavMenu.selectElement(locale_props.getProperty(PROPS.getProperty("select_sub_element")));

        logger.step(3);
        ActionGamePage actionGamePage = new ActionGamePage();
        actionGamePage.storeTabBar.getTopSellersTab(PROPS.getProperty("tab_id")).selectTab();
        Game gameWithMaxDiscount = actionGamePage.storeTabBar.topSellersTab.tabRows.getGameWithMaxDiscount();
        actionGamePage.getBrowser().navigate(gameWithMaxDiscount.getUrl());
        GameWithDiscountPage gameWithDiscountPage = new GameWithDiscountPage();
        Game gameWithDiscount = gameWithDiscountPage.getGameWithDiscount();
        gameWithDiscountPage.header.getButton(locale_props.getProperty(PROPS.getProperty("btn_install_steam_header"))).clickAndWait();

        FileUtils.veriryFolder(System.getProperty("user.dir") + new PropertiesResourceManager(BrowserFactory.FILE_NAME_SELENIUM_PROPS).getProperty("path_do_download"));

        AboutPage aboutPage = new AboutPage();
        aboutPage.selectElement(locale_props.getProperty(PROPS.getProperty("btn_install_steam_about")));
//        TimeUnit.SECONDS.sleep(3);
    }
}
