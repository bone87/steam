package steam.test.tests;

import steam.test.tests.forms.*;
import steam.test.tests.utils.ConfigReader;
import webdriver.BaseTest;

public class SteamTest extends BaseTest {

    @Override
    public void runTest() throws InterruptedException {

        logger.step(2);
        MainPage mainPage = new MainPage();
        mainPage.navArea.moveToElement(ConfigReader.ELEMENT_NAME);
        mainPage.navArea.popupNavMenu.selectElement(ConfigReader.SUB_ELEMENT_NAME);
//
//        logger.step(3);
//        ActionGamePage actionGamePage = new ActionGamePage();
//        actionGamePage.storeTabBar.getTopSellersTab(PROPS.getProperty("tab_id")).selectTab();
//
//        logger.step(4);
//        Game gameWithMaxDiscount = actionGamePage.storeTabBar.topSellersTab.tabRows.getGameWithMaxDiscount();
//
//        logger.step(5);
//        actionGamePage.getBrowser().navigate(gameWithMaxDiscount.getUrl());
////        actionGamePage.getBrowser().navigate("http://store.steampowered.com/agecheck/app/271590/");
//
//        AgeRequestPage ageRequestPage = new AgeRequestPage();
//        System.out.println(ageRequestPage.boxTextGate.isPresent());
//        if (ageRequestPage.boxTextGate.isPresent()) {
//            ageRequestPage.fillAgeAndConfirm(PROPS.getProperty("day_value"),
//                                             PROPS.getProperty("month_value"),
//                                             PROPS.getProperty("year_value"),
//                                             locale_props.getProperty("btn_enter_name"));
//        }
//        logger.step(99);
//
//        GameWithDiscountPage gameWithDiscountPage = new GameWithDiscountPage();
//        Game gameWithDiscount = gameWithDiscountPage.getGameWithDiscount();
//
//        logger.step(6);
//        gameWithDiscountPage.header.getButton(locale_props.getProperty("btn_install_steam_header")).clickAndWait();
//        FileUtils.veriryFolder(USER_DIR + SELENIUM_PROPS.getProperty("path_do_download"));
//
//
//        logger.step(7);
//        AboutPage aboutPage = new AboutPage();
//        aboutPage.selectElement(locale_props.getProperty("btn_install_steam_about"));
//        FileUtils.waitForFileDownload(USER_DIR + SELENIUM_PROPS.getProperty("path_do_download"),
//                PROPS.getProperty("file_name_for_download"), Integer.parseInt(PROPS.getProperty("wait_for_download")));
    }
}
