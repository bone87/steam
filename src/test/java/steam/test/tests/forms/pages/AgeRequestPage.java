package steam.test.tests.forms.pages;

import org.openqa.selenium.By;
import webdriver.elements.Button;
import webdriver.elements.DropBox;
import webdriver.elements.TextBox;

public class AgeRequestPage {
    private final String DRB_AGE_STRING_LOCATOR = "//select[@name='%s']";
    private TextBox txbAgeGate = new TextBox(By.xpath("//div[@id='agegate_box']"), "age request");
    private DropBox drbAgeDay = new DropBox(By.xpath(String.format(DRB_AGE_STRING_LOCATOR, "ageDay")), "ageDay");
    private DropBox drbAgeMonth = new DropBox(By.xpath(String.format(DRB_AGE_STRING_LOCATOR, "ageMonth")), "ageMonth");
    private DropBox drbAgeYear = new DropBox(By.xpath(String.format(DRB_AGE_STRING_LOCATOR, "ageYear")), "ageYear");
    private final String BTN_STRING_LOCATOR = "//span[contains(text(),'%s')]";

    public void fillAgeAndConfirm(String dayValue, String monthValue, String yearValue, String btnName) {
        drbAgeDay.select(dayValue);
        drbAgeMonth.select(monthValue);
        drbAgeYear.select(yearValue);
        new Button(By.xpath(String.format(BTN_STRING_LOCATOR, btnName)), btnName).clickAndWait();
    }

    public boolean isAgeGateIsPresent() {
        return txbAgeGate.isPresent();
    }

}
