package io;

/*
* 通过提高每次读写的数据量,减少实际读写的次数,可以提高读写效率
*
* 单字节的读写属于随机读写形式
* 一组字节的读写属于块读写形式
* 大多数的硬件块读写都比随机读写性能好,尤其机械硬盘上体现最为明显
*
* InputStream和OutputStream上定义了块读写数据的相关方法
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.png");
        FileOutputStream fos = new FileOutputStream("image_cp2.png");

        byte[] data = new byte[1024*10];
        int len;

        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1){
            //fos.write(data);
            fos.write(data,0,len);
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完毕!耗时:"+(end-start)+"ms");
        fis.close();
        fos.close();
    }
}
