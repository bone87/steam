package steam.test.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Browser;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

public class FileUtils {

    public static File veriryFolder(String path_to_folder) {
        File folder  = new File(path_to_folder);
        if (folder.exists()) {
            if (!isEmpty(folder)) {
                System.out.println("DELETE");
                delete(folder);
                System.out.println("CREATED");
                folder.mkdir();
            }
        } else {
            System.out.println("CREATED");
            folder.mkdir();
        }
        return folder;
    }

    private static void delete(File file)
    {
        if (file != null) {
            if (!file.exists())
                return;
            if (file.isDirectory()) {
                for (File f : file.listFiles())
                    delete(f);
                file.delete();
            } else {
                file.delete();
            }
        }
    }

    private static Boolean isEmpty(final File file) {
        return (file.isDirectory() && (file.list().length == 0));
    }

    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }
    public static boolean isFolderSizeNotZero(File folder) {
        long folderSize = folderSize(folder);
        return folderSize > 0;
    }


    public static void waitForFileDownload(String pathToFile, String fileName, int waitForDownload) {
        new WebDriverWait(Browser.getDriver(), waitForDownload).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                File file = new File(String.format("%s%s", pathToFile, fileName));
                return (file.exists() && file.length()>0);
            }
        });
    }

}
