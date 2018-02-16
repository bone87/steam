package onliner.uper.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;

public class UserTopicsPage extends BaseForm {
    private final String BTN_UP_TOPIC = "//div[@id='user-topics-container']//a[text()='UP']";

    public UserTopicsPage() {
        super(By.xpath("//div[@id='user-topics-container']"), "user-topics-container");
    }

    public void upNextTopic() {
        new Button(By.xpath(BTN_UP_TOPIC), "btn_up_topic").clickAndWait();
    }
}
