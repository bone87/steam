package steam.test.tests.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steam.test.tests.models.Game;
import webdriver.Browser;
import webdriver.BrowserFactory;
import webdriver.CommonFunctions;
import webdriver.elements.Label;
import webdriver.table.Table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TabRows {
    private final static String DISCOUNT_STRING_LOCATOR = "//div[@class='%s']";

    private List<Game> discountGames = new ArrayList<>();
    private final String ALL_DISCOUNTS_STRING_LOCATORS = "(//div[@id='TopSellersRows']//div[@class='discount_block tab_item_discount']/..)";
    private final String DISCOUNT_PCT_STRING_LOCATOR = String.format(DISCOUNT_STRING_LOCATOR,"discount_pct");
    private final String DISCOUNT_ORIGINAL_PRICE_STRING_LOCATOR = String.format(DISCOUNT_STRING_LOCATOR,"discount_original_price");
    private final String DISCOUNT_FINAL_PRICE_STRING_LOCATOR = String.format(DISCOUNT_STRING_LOCATOR,"discount_final_price");
    private final String DIGIT_PATTERN = "([\\d\\.]+)";

    public TabRows() {
        List<WebElement> rows = Browser.getDriver().findElementsByXPath(ALL_DISCOUNTS_STRING_LOCATORS);
        for (int x = 1; x <= rows.size(); x++) {
            String stringLocator = ALL_DISCOUNTS_STRING_LOCATORS + String.format("[%s]",x);
            String href = new Label(By.xpath(stringLocator),String.format("game #%s",x)).getAttribute("href");
            String discount_pct = new Label(By.xpath(stringLocator + DISCOUNT_PCT_STRING_LOCATOR),String.format("discount_pct for game #%s",x)).getText();
            String discount_original_price = new Label(By.xpath(stringLocator + DISCOUNT_ORIGINAL_PRICE_STRING_LOCATOR),String.format("discount_original_price for game #%s",x)).getText();
            String discount_final_price = new Label(By.xpath(stringLocator + DISCOUNT_FINAL_PRICE_STRING_LOCATOR),String.format("discount_final_price_string_locator for game #%s",x)).getText();
            discount_pct = CommonFunctions.regexGetMatchGroup(discount_pct, DIGIT_PATTERN, 1, false);
            discount_original_price = CommonFunctions.regexGetMatchGroup(discount_original_price, DIGIT_PATTERN, 1, false);
            discount_final_price = CommonFunctions.regexGetMatchGroup(discount_final_price, DIGIT_PATTERN, 1, false);
            if (discount_pct != null & discount_original_price != null && discount_final_price != null) {
                discountGames.add(new Game(href, Float.parseFloat(discount_pct), Float.parseFloat(discount_original_price), Float.parseFloat(discount_final_price)));
            }
        }
    }

    public Game getGameWithMaxDiscount() {
        return Collections.max(discountGames);

    }
}