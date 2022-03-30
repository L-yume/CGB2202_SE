package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        FileOutputStream fos = new FileOutputStream("note.txt",true);

        String line;
        byte[] data;
        while (!("exit").equals(line=scan.nextLine())){
            data = line.getBytes(StandardCharsets.UTF_8);
            fos.write(data);
        }

        System.out.println("写入完毕!");
        fos.close();
    }
}
