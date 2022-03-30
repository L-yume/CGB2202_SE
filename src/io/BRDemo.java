package io;

/*
* 缓冲字节输入流
* java.io.BufferedReader
* 块读文本数据加速,并且可以按行读取字符串
* */

import java.io.*;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        /*
        * BufferedReader提供两一个读取一行字符串的方法
        * String readLine()
        * 该方法会连续读取若干字符,当遇到换行符停止,然后将换行符之前的内容以一个字符串形式返回
        * 注:如果读取到了末尾,会返回null
        * */

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
