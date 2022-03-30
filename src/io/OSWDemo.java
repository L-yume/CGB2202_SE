package io;

/*
* 字符流
* java将流按照读写的数据单位划分为字节流和字符流
* java.io.InputStream和OutputStream是所有字节输入和输出流得超类
* java.io.Reader和Writer则是所有字符输入与输出流的超类
* 注:这两对超类之间是平级的,互相没有继承关系
*
* 转换流
* java.io.InputStreamReader和OutputStreamWriter
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        String line = "封锁了福建欧圣";
        osw.write(line);
        System.out.println("写出完毕!");
        osw.close();
    }
}
