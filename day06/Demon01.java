package cn.wt.day06;

public class Demon01 {
    public static void main(String[] args) {
        // 实例化
        Student stu = new Student();
        // 赋值
        stu.name = "tom";
        stu.age = 9999;
        System.out.println(stu.name);
        System.out.println(stu.age);
        // 调用方法
        stu.eat("耗子");
        int isScore = stu.score(90, 69);
        System.out.println(isScore);
    }
}
