package cn.wt.day07.Demon04;

import java.util.ArrayList;
import java.util.Random;

// 用大集合随机存放20个整数，在取其中的奇数存在小集合中，使用自定义方法
public class Demon04 {
    public static void main(String[] args) {
        ArrayList<Integer> bigLst = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            bigLst.add(ran.nextInt(100));
        }
        ArrayList<Integer> res = isChoice(bigLst);
        System.out.println(res);
    }
    public static ArrayList<Integer> isChoice(ArrayList<Integer> isLst){
        ArrayList<Integer> smallLst = new ArrayList<>();
        for (int i = 0; i < isLst.size(); i++) {
            if(isLst.get(i) % 2 ==1){
                smallLst.add(isLst.get(i));
            }
        }
        return smallLst;
    }
}
