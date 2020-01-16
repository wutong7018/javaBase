package cn.wt.day07.Demon02A;

// 1. 导包
import java.util.Random;

public class Demon01Random {
    public static void main(String[] args) {
        // 2.初始化对象
        Random rand = new Random();
        // 3. 使用 生成随机的int类型
        int r1 = rand.nextInt();
        System.out.println(r1);
    }
}
