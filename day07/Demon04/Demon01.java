package cn.wt.day07.Demon04;

import java.util.ArrayList;
import java.util.Random;

// 要求 生成 6个 1 到 66 的随机数字，保存到集合并遍历
public class Demon01 {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> intLst = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int randNum = ran.nextInt(66) + 1;
            intLst.add(randNum);
        }
        for (int i = 0; i < intLst.size(); i++) {
            System.out.println(intLst.get(i));
        }
    }
}
