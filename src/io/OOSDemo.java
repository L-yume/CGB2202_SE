package io;

/*
* 对象流
* java.io.ObjectOutputStream和ObjectInputStream
* 它们是一对高级流,在链接中的作用是进行对象的序列化与反序列化
* 对象序列化:将对象按照其结构转化为一组字节的过程
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是个演员","来自霓虹","台词较少"};

        Person p = new Person(name,age,gender,otherInfo);
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        /*
        * 对象输出軣提供了序列化方法
        * void writeObject(Object obj)
        * 将给定的对象转换为一组字节并写出,但是需要注意:写出的对象的类必训实现接口:
        * java.io.Serializable
        * 否则该方法会抛出异常:java.io.NotSerializableException
        * */

        oos.writeObject(p);
        System.out.println("写出完毕!");
        oos.close();
    }
}


