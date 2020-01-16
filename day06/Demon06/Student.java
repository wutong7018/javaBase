package cn.wt.day06.Demon06;

public class Student {
    // 私有化 成员变量
    private String name;
    private int age;
    private boolean sex;

    // 无参构造方法
    public Student() {
    }
    // 全参构造方法
    public Student(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
