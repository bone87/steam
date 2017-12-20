package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropBox extends BaseElement{
    protected DropBox(By loc) {
        super(loc);
    }

    public DropBox(By loc, String nameOf) {
        super(loc, nameOf);
    }

    public DropBox(By locatorStageA, By locatorStageB, String nameOfElement) {
        super(locatorStageA, locatorStageB, nameOfElement);
    }

    public DropBox(String stringLocator, String nameOfElement) {
        super(stringLocator, nameOfElement);
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
