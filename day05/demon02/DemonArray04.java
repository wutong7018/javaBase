package cn.wt.day05.demon02;

public class DemonArray04 {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 3};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[arr1.length-1-i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
