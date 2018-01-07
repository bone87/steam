package steam.test.tests.utils;

import webdriver.BrowserFactory;
import webdriver.PropertiesResourceManager;

public class ConfigReader {
    public static final PropertiesResourceManager LOCALE_PROPS =  new PropertiesResourceManager(Localler.getLocaleDictionary());
    private static final String STEAM_PROPERTIES_FILE = "steam_project.properties";
    public static final PropertiesResourceManager PROPS = new PropertiesResourceManager(STEAM_PROPERTIES_FILE);
    private static final String PROPERTY_NAME_ELEMENT_NAME = "move_to_element";
    private static final String PROPERTY_NAME_SUB_ELEMENT_NAME = "select_sub_element";
    public static final String ELEMENT_NAME = LOCALE_PROPS.getProperty(PROPS.getProperty(PROPERTY_NAME_ELEMENT_NAME));
    public static final String SUB_ELEMENT_NAME = LOCALE_PROPS.getProperty(PROPS.getProperty(PROPERTY_NAME_SUB_ELEMENT_NAME));
    private static final PropertiesResourceManager SELENIUM_PROPS = new PropertiesResourceManager(BrowserFactory.FILE_NAME_SELENIUM_PROPS);

    private final String USER_DIR = System.getProperty("user.dir");

}
