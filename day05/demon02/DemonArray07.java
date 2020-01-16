package cn.wt.day05.demon02;

public class DemonArray07 {
    public static void main(String[] args) {
        int[] result = isCal(10, 20);
        System.out.println(result[1]);
    }

    public static int[] isCal(int a, int b){
        int isSum = a + b;
        int isMax = a > b ? a:b;
        int isAvg = (a+b)/2;
        int[] total = {isSum, isMax, isAvg};
        return total;
    }
}
