package onliner.uper.pages;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class LoginPage extends BaseForm {

    private final String TXTBOX_USER_NAME = "//input[@placeholder='Ник или e-mail']";
    private final String TXTBOX_USER_PASSWORD = "//input[@placeholder='Пароль']";
    private final String BTN_LOGIN = "//div[@id='auth-container__forms']//button[contains(text(),'Войти')]";
    public LoginPage() {
        super(By.xpath("//div[@id='auth-container__forms']"), "auth-container__forms");
    }

    public void login(String userName, String password) {
        new TextBox(By.xpath(TXTBOX_USER_NAME), "txtbox_user_name").setText(userName);
        new TextBox(By.xpath(TXTBOX_USER_PASSWORD), "txtbox_user_password").setText(password);
        new Button(By.xpath(BTN_LOGIN), "btn_login").clickAndWait();
    }
}
