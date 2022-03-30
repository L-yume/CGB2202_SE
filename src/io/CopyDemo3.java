package io;

/*
* java将流分为两类:节点流与处理流
* 节点流:又称为低级流,是实际连接我们的程序与另一端的"管道,负责实际读写数据的流.
*       记住:读写一定是建立在低级流的基础上进行的.
* 处理流:又称为高级流,过滤流,不能独立存在,必须连接在其它流上
*
* 缓冲流
* java.io.BufferedInputStream和BufferedOutputStream
* 缓冲流在流连接中得作用是加快读写效率
* */

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("image.png");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("image_cp3.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d = 0;
        long start = System.currentTimeMillis();
        while ((d = bis.read())!=-1){
            bos.write(d);
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完成!耗时:"+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}
