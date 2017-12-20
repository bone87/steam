package steam.test.tests.forms;

import org.openqa.selenium.By;
import webdriver.elements.Button;
import webdriver.elements.DropBox;
import webdriver.elements.TextBox;

public class AgeRequestPage {
    public TextBox boxTextGate = new TextBox(By.xpath("//div[@id='agegate_box']"), "age request");

    private DropBox drbAgeDay = new DropBox(By.xpath("//select[@name='ageDay']"), "ageDay");
    private DropBox drbAgeMonth = new DropBox(By.xpath("//select[@name='ageMonth']"), "ageMonth");
    private DropBox drbAgeYear = new DropBox(By.xpath("//select[@name='ageYear']"), "ageYear");
    private String btnEnter = "//span[contains(text(),'%s')]";

    public void fillAgeAndConfirm(String dayValue, String monthValue, String yearValue, String btnName) {
        drbAgeDay.select(dayValue);
        drbAgeMonth.select(monthValue);
        drbAgeYear.select(yearValue);
        new Button(By.xpath(String.format(btnEnter, btnName)), btnName).clickAndWait();
    }

}
