package Lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("o");
            }
        };

        //lambda表达式-----简化匿名内部类
        FileFilter filter1 = (File file)->{
            return file.getName().contains("o");
        };
        //还可以简化,参数类型可以忽略不写,如果只有一个参数时,参数列表的()可以不写
        FileFilter filter2 = file->{
            return file.getName().contains("o");
        };
        //当方法体中只有一条语句时,方法体的{}可以忽略,并且含有return时要一并忽略
        FileFilter filter3 = file->file.getName().contains("o");
    }
}
