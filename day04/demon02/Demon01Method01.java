package cn.wt.day04.demon02;

public class Demon01Method01 {
    public static void main(String[] args) {
        String result;
        result = isSame(10, 20);
        System.out.println(result);
    }

    public static String isSame(int a, int b){
        if (a == b){
            return "相等";
        } else {
            return "不相等";
        }
    }
}
