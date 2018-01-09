package steam.test.tests.forms.pages;

import org.openqa.selenium.By;

public class MainPage extends BasePageWithNav{

    public MainPage() {
        super(By.xpath("//div[@id='home_maincap_v7']"), "main page");
    }

}
