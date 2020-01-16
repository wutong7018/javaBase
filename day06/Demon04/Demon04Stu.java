package cn.wt.day06.Demon04;

public class Demon04Stu {
    public static void main(String[] args) {
        Person per = new Person();
        per.name = "张飞";
        per.setAge(-20);
        per.setSex(true);
        per.info();

        System.out.println(per.getAge()+ "我干" + per.isSex());
    }
}
