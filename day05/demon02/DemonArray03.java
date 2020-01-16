package cn.wt.day05.demon02;

public class DemonArray03 {
    public static void main(String[] args) {
        int[] array = {10, 2, 3, 7, 9, 8, 3, 4, 20};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
