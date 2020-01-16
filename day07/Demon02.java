package cn.wt.day07;

import java.util.Scanner;

public class Demon02 {
    public static void main(String[] args) {
        System.out.println("求出三个数的最大值");
        Scanner scan = new Scanner(System.in);
        System.out.print("第一个整数：");
        int a = scan.nextInt();
        System.out.print("第二个整数：");
        int b = scan.nextInt();
        System.out.print("第三个整数：");
        int c = scan.nextInt();
        int res = isMax(a, b, c);
        System.out.println("最大值为：" + res);
    }

    public static int isMax(int x, int y , int z){
        int temp = x > y ? x:y;
        int max = temp > z ? temp: z;
        return max;
    }
}
