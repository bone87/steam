package steam.test.tests;

import steam.test.tests.forms.pages.*;
import steam.test.tests.models.Game;
import steam.test.tests.utils.ConfigReader;
import steam.test.tests.utils.FileUtils;
import webdriver.BaseTest;

public class SteamTest extends BaseTest {

    @Override
    public void runTest() {

        logger.step(2);
        MainPage mainPage = new MainPage();
        mainPage.navArea.moveToElement(ConfigReader.ELEMENT_NAME);
        mainPage.navArea.popupNavMenu.selectElement(ConfigReader.SUB_ELEMENT_NAME);

        logger.step(3);
        ActionGamePage actionGamePage = new ActionGamePage();
        actionGamePage.storeTabBar.getTab(ConfigReader.TAB_NAME).selectTab();

        logger.step(4);
        Game gameWithMaxDiscount = actionGamePage.storeTabBar.tab.tabRows.getGameWithMaxDiscount();

        logger.step(5);
        actionGamePage.getBrowser().navigate(gameWithMaxDiscount.getUrl());
        AgeRequestPage ageRequestPage = new AgeRequestPage();
        if (ageRequestPage.isAgeGateIsPresent()) {
            ageRequestPage.fillAgeAndConfirm(ConfigReader.DAY_VALUE,
                                             ConfigReader.MONTH_VALUE,
                                             ConfigReader.YEAR_VALUE,
                                             ConfigReader.BTN_ENTER_NAME);
        }
        GameWithDiscountPage gameWithDiscountPage = new GameWithDiscountPage();
        Game gameWithDiscount = gameWithDiscountPage.getGameWithDiscount();
        assertEquals("Games aren't equal", gameWithMaxDiscount, gameWithDiscount);

        logger.step(6);
        gameWithDiscountPage.header.clickButton(ConfigReader.BTN_INSTALL_STEAM_HEADER);
        FileUtils.veriryFolder(ConfigReader.PATH_DO_DOWNLOAD);

        logger.step(7);
        AboutPage aboutPage = new AboutPage();
        aboutPage.selectElement(ConfigReader.BTN_INSTALL_STEAM_ABOUT);
        FileUtils.waitForFileDownload(ConfigReader.PATH_DO_DOWNLOAD,
                                      ConfigReader.FILE_NAME_FOR_DOWNLOAD,
                                      Integer.parseInt(ConfigReader.WAIT_FOR_DOWNLOAD));
    }
}
