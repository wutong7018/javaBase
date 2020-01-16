package cn.wt.day07.Demon02A;


import java.util.Random;
import java.util.Scanner;

public class Demon03Rand {
    public static void main(String[] args) {
        // 1. 随机生成一个数
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 5){
            System.out.print("请输入数子");
            int guessNum = scan.nextInt();
            if (guessNum > randNum){
                System.out.println("大了");
            } else if (guessNum < randNum){
                System.out.println("小了");
            } else {
                System.out.println("答对了");
                break;
            }
            count ++;
        }

    }
}
