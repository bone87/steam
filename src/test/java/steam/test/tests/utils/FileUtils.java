package steam.test.tests.utils;

import java.io.File;

public class FileUtils {
    private static File folder;

    public static void veriryFolder(String path_to_folder) {
        folder  = new File(path_to_folder);
        if (folder.exists()) {
            if (!isEmpty(folder)) {
                delete(folder);
                folder.mkdir();
            }
        } else {
            folder.mkdir();
        }
    }

    private static void delete(File file)
    {
        if(!file.exists())
            return;
        if(file.isDirectory())
        {
            for(File f : file.listFiles())
                delete(f);
            file.delete();
        }
        else
        {
            file.delete();
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
    public static boolean isFolderSizeNotZero() {
        long folderSize = folderSize(folder);
        if (folderSize>0) {
            return true;
        } else return false;
    }
}
