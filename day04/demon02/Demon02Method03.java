package cn.wt.day04.demon02;

public class Demon02Method03 {
    public static void main(String[] args) {
        printWord(10);
    }

    public static void printWord(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, World" + (i + 1));
        }
    }
}
