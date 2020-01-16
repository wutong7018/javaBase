package cn.wt.day05.demon02;

public class DemonArray06 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 7, 3, 5, 0};
        printArray(array);
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
