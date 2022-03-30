package homeWork.day04;

import java.io.File;
import java.io.FileFilter;

/**
 * 列出当前目录中所有名字包含s的子项。
 *
 * 使用匿名内部类和lambda两种写法
 *
 */

public class Test01 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()){
            //第一种写法:匿名内部类
            /*FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().contains("s");
                }
            };

            File[] subs = dir.listFiles(filter);*/

            //第二种写法:Lambda
            File[] subs = dir.listFiles(file->file.getName().contains("s"));
            System.out.println("当前含s的目录有"+subs.length+"个");
            for (int i = 0; i < subs.length; i++) {
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
