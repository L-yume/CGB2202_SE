package homeWork.day04;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 *
 */

public class Test02 {
    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        if (dir.isDirectory()){
            File[] subs = dir.listFiles(file->file.isFile());
            for (int i = 0; i < subs.length; i++) {
                File file = subs[i];
                String fileName = file.getName();
                //获取文件名
                String name1 = fileName.substring(0,fileName.lastIndexOf("."));
                //获取文件后缀
                String name2 = fileName.substring(fileName.lastIndexOf(".")+1);

                String newFileName = name1+"_cp."+name2;
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(newFileName);
                byte[] data = new byte[1024*10];
                int len;
                while ((len = fis.read(data))!=-1){
                    fos.write(data,0,len);
                }
                fis.close();
                fos.close();
            }
        }
        System.out.println("全部复制完毕!");
    }
}
