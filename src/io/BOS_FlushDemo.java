package io;

/*
* 缓冲输出流写出数据的缓冲区问题
* */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BOS_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "klfjiewfj";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        bos.write(data);
        System.out.println("写出完毕!");

        //当缓冲区中写的字节过少时,它并不会输出所以造成内容写不进去,这时调用flush(),强制将缓冲区中的内容输出
        bos.flush();
        bos.close();
    }
}
