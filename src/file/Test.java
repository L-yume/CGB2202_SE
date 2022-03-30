package file;

import java.io.File;
import java.io.FileFilter;

public class Test {
    public static void main(String[] args) {
        File dir = new File("./src/file");
        if (dir.isDirectory()){
            /*FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.startsWith("D");
                }
            };*/
            //lambda表达式-----简化匿名内部类
            FileFilter filter = (File file)->{
                return file.getName().contains("o");
            };
            File[] subs = dir.listFiles(filter);
            System.out.println("当前含D开头的文件有"+subs.length+"个");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
