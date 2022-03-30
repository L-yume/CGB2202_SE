package exception;

/*
* 异常的抛出
* throw关键字可以主动对外抛出一个异常
* 通常：
* 1：程序出现了异常，但是该异常不应当在当前代码中被解决时，可以主动将其抛出
* 2：程序可以运行，但是不满足业务场景要求时可以当作异常抛出
* */

public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了！");
        Person p = new Person();
        p.setAge(1000);

        System.out.println("此人年龄:"+p.getAge());

        System.out.println("程序结束了！");
    }
}
