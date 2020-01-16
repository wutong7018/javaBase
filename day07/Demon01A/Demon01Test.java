package cn.wt.day07.Demon01A;

public class Demon01Test {
    public static void main(String[] args) {
        // 下面两行代码没有联系，匿名对象每一次都是创建新的对象
        new Person().name = "tom";
        new Person().isIntro();
    }
}
