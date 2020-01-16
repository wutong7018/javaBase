package cn.wt.day07.Demon03AL;

import java.util.ArrayList;

public class Demon01 {
    public static void main(String[] args) {
        ArrayList<String> strLst = new ArrayList<>();
        strLst.add("路飞");
        strLst.add("索隆");
        strLst.add("娜美");
        System.out.println(strLst);
        System.out.println("索引为2的值为" + strLst.get(2));
        strLst.remove(0);
        System.out.println(strLst);
        System.out.println(strLst.size());
    }
}
