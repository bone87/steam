package steam.test.tests.utils;

import webdriver.BrowserFactory;
import webdriver.PropertiesResourceManager;

public class ConfigReader {
    private static final PropertiesResourceManager LOCALE_PROPS =  new PropertiesResourceManager(Localler.getLocaleDictionary());
    private static final String STEAM_PROPERTIES_FILE = "steam_project.properties";
    private static final PropertiesResourceManager PROPS = new PropertiesResourceManager(STEAM_PROPERTIES_FILE);
    private static final String PROPERTY_NAME_ELEMENT_NAME = "move_to_element";
    private static final String PROPERTY_NAME_SUB_ELEMENT_NAME = "select_sub_element";
    private static final String PROPERTY_NAME_TAB_NAME = "tab_name";
    private static final String PROPERTY_NAME_DAY_VALUE = "day_value";
    private static final String PROPERTY_NAME_MONTH_VALUE = "month_value";
    private static final String PROPERTY_NAME_YEAR_VALUE = "year_value";
    private static final String PROPERTY_NAME_BTN_ENTER_NAME = "btn_enter_name";
    private static final String PROPERTY_NAME_BTN_INSTALL_STEAM_HEADER = "btn_install_steam_header";
    private static final String PROPERTY_NAME_PATH_DO_DOWNLOAD = "path_do_download";
    private static final String PROPERTY_NAME_BTN_INSTALL_STEAM_ABOUT = "btn_install_steam_about";
    private static final String PROPERTY_NAME_FILE_NAME_FOR_DOWNLOAD = "file_name_for_download";
    private static final String PROPERTY_NAME_WAIT_FOR_DOWNLOAD = "wait_for_download";

    public static final String ELEMENT_NAME = LOCALE_PROPS.getProperty(PROPS.getProperty(PROPERTY_NAME_ELEMENT_NAME));
    public static final String SUB_ELEMENT_NAME = LOCALE_PROPS.getProperty(PROPS.getProperty(PROPERTY_NAME_SUB_ELEMENT_NAME));
    public static final String TAB_NAME = PROPS.getProperty(PROPERTY_NAME_TAB_NAME);
    public static final String DAY_VALUE = PROPS.getProperty(PROPERTY_NAME_DAY_VALUE);
    public static final String MONTH_VALUE = PROPS.getProperty(PROPERTY_NAME_MONTH_VALUE);
    public static final String YEAR_VALUE = PROPS.getProperty(PROPERTY_NAME_YEAR_VALUE);
    public static final String BTN_ENTER_NAME = LOCALE_PROPS.getProperty(PROPERTY_NAME_BTN_ENTER_NAME);
    public static final String BTN_INSTALL_STEAM_HEADER = LOCALE_PROPS.getProperty(PROPERTY_NAME_BTN_INSTALL_STEAM_HEADER);
    public static final String BTN_INSTALL_STEAM_ABOUT = LOCALE_PROPS.getProperty(PROPERTY_NAME_BTN_INSTALL_STEAM_ABOUT);
    public static final String FILE_NAME_FOR_DOWNLOAD = PROPS.getProperty(PROPERTY_NAME_FILE_NAME_FOR_DOWNLOAD);
    public static final String WAIT_FOR_DOWNLOAD = PROPS.getProperty(PROPERTY_NAME_WAIT_FOR_DOWNLOAD);

    private static final String USER_DIR = System.getProperty("user.dir");
    private static final PropertiesResourceManager SELENIUM_PROPS = new PropertiesResourceManager(BrowserFactory.FILE_NAME_SELENIUM_PROPS);
    public static final String PATH_DO_DOWNLOAD = USER_DIR + SELENIUM_PROPS.getProperty(PROPERTY_NAME_PATH_DO_DOWNLOAD);



}
