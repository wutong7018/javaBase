package cn.wt.day06;

import java.util.Arrays;

public class Demon03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        // 类 做为 参数 和 返回值
        Student res = getStudent(s1);
        System.out.println(res);
        System.out.println(res.name);
        int[] a = {3, 9, 2, 1};
        System.out.println(Arrays.toString(a));
    }

    public static Student getStudent(Student stu){
        stu.name = "海贼王";
        return stu;
    }
}
