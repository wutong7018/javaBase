package cn.wt.day07.Demon03AL;

public class Demon02Per {
    public static void main(String[] args) {
        Person[] per = new Person[3];
        per[0] = new Person("tom", 24);
        per[1] = new Person("路飞", 18);
        per[2] = new Person("索隆", 20);

        System.out.println(per[2].getName());
        for (int i = 0; i < per.length; i++) {
            // 地址
            System.out.println(per[i]);
        }
    }
}
