package steam.test.tests.utils;

import java.io.File;

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
}
