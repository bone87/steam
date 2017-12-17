package steam.test.tests.utils;

import org.openqa.selenium.By;
import webdriver.elements.Label;

public class Localler {

    public static String getLocaleDictionary(){
        Label label = new Label(By.xpath("//*[@lang]"), "language");
        return String.format("dict_%s.properties", label.getAttribute("lang"));
    }
}
