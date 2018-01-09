package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropBox extends BaseElement{

    public DropBox(By loc, String nameOf) {
        super(loc, nameOf);
    }

    @Override
    protected String getElementType() {
        return getLoc("loc.dropBox");
    }

    public void select(String value) {
        Select select = new Select(getElement());
        select.selectByValue(value);
    }
}
