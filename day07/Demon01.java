package cn.wt.day07;
// 1. 导包
import java.util.Scanner;

public class Demon01 {
    public static void main(String[] args) {
        // System.in  键盘输入
        // 2. 初始化对象
        Scanner scan = new Scanner(System.in);
        // 2. 使用
        System.out.print("请输入第一个整数:");
        int a = scan.nextInt();
        System.out.print("请输入第二个整数:");
        int b = scan.nextInt();
        System.out.println("计算结果为：" + (a+b));
    }
}
