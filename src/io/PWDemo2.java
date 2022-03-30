package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw =new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);

        String line;
        while (!("exit").equalsIgnoreCase(line= scan.nextLine())){
            pw.println(line);
        }
        //pw.println("fsfsdffsfdss");
        System.out.println("写入完毕!");
        pw.close();
    }
}
