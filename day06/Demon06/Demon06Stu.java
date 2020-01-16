package cn.wt.day06.Demon06;

public class Demon06Stu {
    public static void main(String[] args) {
        // 无参构造方法
        Student stu1 = new Student();
        stu1.setName("tom");
        stu1.setAge(24);
        stu1.setSex(true);
        System.out.println("姓名：" + stu1.getName() + "年龄: " + stu1.getAge() + "性别:" + stu1.isSex());

        System.out.println("================================================================");
        // 全参 构造方法
        Student stu2 = new Student("rose", 79, false);
        System.out.println("姓名：" + stu2.getName() + "年龄: " + stu2.getAge() + "性别:" + stu2.isSex());
        stu2.setSex(true);
        stu2.setAge(8000);
    }
}
