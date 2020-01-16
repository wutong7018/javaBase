package cn.wt.day05.demon01;

public class Demon03 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================================");
        array[1] = 90;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
