package cn.wt.day05.demon02;

public class DemonArray05 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 5};
        int temp;
        for (int i = 0; i < (int)arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
