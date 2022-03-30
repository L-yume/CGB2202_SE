package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        File dir = new File("./demo");
        if(dir.exists()){
            System.out.println("该目录已存在!");
        }else{
            //dir.mkdir();创建目录时要求所在的目录必须存在,否则创建失败
            dir.mkdirs();
            System.out.println("该目录已创建!");
        }
    }
}
