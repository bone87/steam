package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import steam.test.tests.models.Game;
import webdriver.CommonFunctions;
import webdriver.elements.Label;

public class GameWithDiscountPage extends BasePage
{
    private final static String STRING_LOCATOR = "//div[@id='game_area_purchase']//div[@class='%s']";
    private final String DIGIT_PATTERN = "([\\d\\.]+)";
    private Label labelDiscountPct = new Label(By.xpath(String.format(STRING_LOCATOR, "discount_pct")), "discount pct");
    private Label labelDiscountOriginalPrice = new Label(By.xpath(String.format(STRING_LOCATOR, "discount_original_price")), "discount original price");
    private Label labelDiscountGinalPrice = new Label(By.xpath(String.format(STRING_LOCATOR, "discount_final_price")), "discount final price");

    public GameWithDiscountPage() {
        super(By.xpath(String.format(STRING_LOCATOR, "discount_block game_purchase_discount")), "page for game with discount");
    }

    public Game getGameWithDiscount() {
        String discount_pct = CommonFunctions.regexGetMatchGroup(labelDiscountPct.getText(), DIGIT_PATTERN, 1, false);
        String discount_original_price = CommonFunctions.regexGetMatchGroup(labelDiscountOriginalPrice.getText(), DIGIT_PATTERN, 1, false);
        String discount_final_price = CommonFunctions.regexGetMatchGroup(labelDiscountGinalPrice.getText(), DIGIT_PATTERN, 1, false);
        if (discount_pct != null & discount_original_price != null && discount_final_price != null) {
            return new Game(null, Float.parseFloat(discount_pct), Float.parseFloat(discount_original_price), Float.parseFloat(discount_final_price));
        }
        return null;
    }
}
