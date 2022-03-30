package io;

/*
java.io.InputStream和OutputStream是所有字节输入流与输出流的超类,它们是抽象类

文件流
java.io.FileInputStream和FileOutputStream,它们继承自InputStream和OutputStream
* */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
       /* 向文件fos.dat中写入一个字节
        文件输出流常用的构造方法:
        FileOutputStream(String path)
        FileOutputStream(File file)*/
        FileOutputStream fos = new FileOutputStream("./fos.dat");//可以自动创建

        /*
        * void write(int d)
        * 写出一个字节,写出的内容是给定的int值的2进制的低八位
        * */

        fos.write(1);
        fos.write(-1);
        fos.write(2);
        System.out.println("写入完毕!");
        fos.close();
    }
}
