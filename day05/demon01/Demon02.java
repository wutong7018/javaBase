package cn.wt.day05.demon01;

public class Demon02 {
    public static void main(String[] args) {
        int[] array = {3, 2, 6, 4, 9, 5};
        for (int min = 0, max = array.length -1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        System.out.println(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
