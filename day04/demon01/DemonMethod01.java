package cn.wt.day04.demon01;

public class DemonMethod01 {
    public static void main(String[] args) {
        printRect();
    }

    // 打印 5 * 20 的矩形
    public static void printRect(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <20 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
