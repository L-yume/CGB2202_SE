package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("./demo");
        if (dir.exists()){
            dir.delete();
            System.out.println("该目录已删除!");
        }else{
            System.out.println("该目录已存在!");
        }
    }
}
