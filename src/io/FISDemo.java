package io;

/*
* 使用文件输入流读取文件数据
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./fos.dat");

        /*
        * int read()
        * 读取一个字节,并以int型返回.返回int值对应的2进制的低八位为读取到的字节数据.
        * 如果返回-1则表示读取到了流的末尾
        * */

        int d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);
    }
}
