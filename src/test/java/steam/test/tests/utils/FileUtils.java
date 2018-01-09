package steam.test.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Browser;

import java.io.File;

public class FileUtils {

    public static void veriryFolder(String path_to_folder) {
        File folder = new File(path_to_folder);
        if (folder.exists()) {
            if (!isFolderEmpty(folder)) {
                deleteFolder(folder);
            }
        }
        folder.mkdir();
    }

    private static void deleteFolder(File file) {
        if (file != null) {
            if (!file.exists())
                return;
            if (file.isDirectory()) {
                for (File f : file.listFiles())
                    deleteFolder(f);
            }
            file.delete();
            }
        }

    private static Boolean isFolderEmpty(final File file) {
        return (file.isDirectory() && (file.list().length == 0));
    }

    public static void waitForFileDownload(String pathToFile, String fileName, int waitForDownload) {
        new WebDriverWait(Browser.getDriver(), waitForDownload).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                File file = new File(String.format("%s%s", pathToFile, fileName));
                return (file.exists() && file.length() > 0);
            }
        });
    }

}
