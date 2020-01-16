package cn.wt.day07.Demon04;

import java.util.ArrayList;

// 定义打印集合的方法， 将ArrayList中的元素打印出来，打印结果{元素@元素@元素}
public class Demon03 {
    public static void main(String[] args) {
        ArrayList<String> strLst = new ArrayList<>();
        strLst.add("tom");
        strLst.add("jack");
        strLst.add("rose");
        strLst.add("joker");
        isPrint(strLst);
    }

    public static void isPrint(ArrayList<String> strLst){
        System.out.print("{");
        for (int i = 0; i < strLst.size(); i++) {
            if(i == strLst.size() - 1){
                System.out.print(strLst.get(i));
            } else {
                System.out.print(strLst.get(i) + "@");
            }
        }
        System.out.print("}");
    }
}
