package file;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().contains("o");
                }
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("当前含o的目录有"+subs.length+"个");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
