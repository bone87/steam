package steam.test.tests.forms;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {


    public AboutPage() {
        super(By.xpath("//div[@id='about_header_ctn']"), "about page");
        btnElementStringLocator = "//div[@id='about_greeting_ctn']//span[text()='Install Steam Now']";
    }
}
