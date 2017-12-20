package steam.test.tests;

import steam.test.tests.forms.*;
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
    private final PropertiesResourceManager SELENIUM_PROPS = new PropertiesResourceManager(BrowserFactory.FILE_NAME_SELENIUM_PROPS);
    private PropertiesResourceManager locale_props;
    private final String USER_DIR = System.getProperty("user.dir");
    @Override
    public void runTest() throws InterruptedException {
        locale_props =  new PropertiesResourceManager(Localler.getLocaleDictionary());

        logger.step(2);
        MainPage mainPage = new MainPage();
        mainPage.navArea.moveToElement(locale_props.getProperty("Games"));
        mainPage.navArea.popupNavMenu.selectElement(locale_props.getProperty("Action"));

        logger.step(3);
        ActionGamePage actionGamePage = new ActionGamePage();
        actionGamePage.storeTabBar.getTopSellersTab(PROPS.getProperty("tab_id")).selectTab();

        logger.step(4);
        Game gameWithMaxDiscount = actionGamePage.storeTabBar.topSellersTab.tabRows.getGameWithMaxDiscount();

        logger.step(5);
//        actionGamePage.getBrowser().navigate(gameWithMaxDiscount.getUrl());
        actionGamePage.getBrowser().navigate("http://store.steampowered.com/agecheck/app/271590/");

        AgeRequestPage ageRequestPage = new AgeRequestPage();
        System.out.println(ageRequestPage.boxTextGate.isPresent());
        if (ageRequestPage.boxTextGate.isPresent()) {
            ageRequestPage.fillAgeAndConfirm(PROPS.getProperty("day_value"),
                                             PROPS.getProperty("month_value"),
                                             PROPS.getProperty("year_value"),
                                             locale_props.getProperty("btn_enter_name"));
        }
        logger.step(99);

        GameWithDiscountPage gameWithDiscountPage = new GameWithDiscountPage();
        Game gameWithDiscount = gameWithDiscountPage.getGameWithDiscount();

        logger.step(6);
        gameWithDiscountPage.header.getButton(locale_props.getProperty("btn_install_steam_header")).clickAndWait();
        FileUtils.veriryFolder(USER_DIR + SELENIUM_PROPS.getProperty("path_do_download"));


        logger.step(7);
        AboutPage aboutPage = new AboutPage();
        aboutPage.selectElement(locale_props.getProperty("btn_install_steam_about"));
        FileUtils.waitForFileDownload(USER_DIR + SELENIUM_PROPS.getProperty("path_do_download"),
                PROPS.getProperty("file_name_for_download"), Integer.parseInt(PROPS.getProperty("wait_for_download")));
    }
}
