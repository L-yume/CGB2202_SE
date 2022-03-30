package io;

/*
* 缓冲字符流
* java.io.BufferedWriter和BufferedReader
* 缓冲字符流是一对高级的字符流,作用是块写文本数据加速的
*
* java.io.PrintWriter具有自动行刷新的缓冲字符输出流,内部总是连接BufferedWriter
* 更常用
* */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","utf-8");
        pw.println("dfgaggdsfgea");
        pw.println("ghgsgfgagfdgfg");
        System.out.println("写出完毕!");
        pw.close();
    }
}
