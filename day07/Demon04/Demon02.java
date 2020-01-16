package cn.wt.day07.Demon04;

import java.util.ArrayList;

// 自定义4个学生类，并保存到ArrayList中，并遍历
public class Demon02 {
    public static void main(String[] args) {
        Student stu1 = new Student("东邪", 78);
        Student stu2 = new Student("西毒", 69);
        Student stu3 = new Student("南帝", 59);
        Student stu4 = new Student("北丐", 47);

        ArrayList<Student> stuLst = new ArrayList<>();
        stuLst.add(stu1);
        stuLst.add(stu2);
        stuLst.add(stu3);
        stuLst.add(stu4);

        for (int i = 0; i < stuLst.size(); i++) {
            System.out.println("姓名:" + stuLst.get(i).getName() + "年龄:" + stuLst.get(i).getAge());
        }
    }
}
