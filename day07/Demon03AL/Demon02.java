package cn.wt.day07.Demon03AL;

import java.util.ArrayList;

public class Demon02 {
    public static void main(String[] args) {
        ArrayList<Integer> intLst = new ArrayList<>();
        // 打印空值
        System.out.println(intLst);
        // 增加
        intLst.add(10);
        intLst.add(15);
        intLst.add(5);
        intLst.add(30);
        System.out.println(intLst);
        // 获取
        System.out.println(intLst.get(1));
        // 删除
        System.out.println(intLst.remove(1));
        // 遍历
        System.out.println("===========================");
        for (int i = 0; i < intLst.size(); i++) {
            System.out.println(intLst.get(i));
        }
    }
}
