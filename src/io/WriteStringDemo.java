package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fos = new FileOutputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos.txt",true);
        //String line = "super idol的笑容都没你的甜,八月正午的阳光都没你耀眼";
        String line = "热爱105度的你,滴滴纯净的蒸馏水";

        byte[] data = line.getBytes(StandardCharsets.UTF_8);

        fos.write(data);
        System.out.println("写出完毕!");

        fos.close();
    }
}
