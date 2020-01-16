package cn.wt.day07.Demon02A;

import java.util.Random;
import java.util.Scanner;

public class Demon02Rand {
    public static void main(String[] args) {
        System.out.print("请输入取值范围:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Random ran = new Random();
        for (int i = 0; i < 20; i++) {
            int randNum = ran.nextInt(num) + 1;
            System.out.println(randNum);
        }
    }
}
