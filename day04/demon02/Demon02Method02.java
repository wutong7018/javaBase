package cn.wt.day04.demon02;

public class Demon02Method02 {
    public static void main(String[] args) {
        System.out.println(sumRange());
    }

    public static int sumRange(){
        int isSum = 0;
        for (int i = 1; i <= 100; i++) {
            isSum += i;
        }
        return isSum;
    }
}
