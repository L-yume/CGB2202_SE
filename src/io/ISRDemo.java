package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        /*
        * 字符流的:
        * int read();
        * 读取一个字符,将对应char值存入返回的int值的"低16位"上
        * 如果返回的值为-1,表示读取到了末尾
        * */
        int d;
        while ((d = isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
