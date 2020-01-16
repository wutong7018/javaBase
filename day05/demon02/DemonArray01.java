package cn.wt.day05.demon02;

public class DemonArray01 {
    public static void main(String[] args) {
        // 动态创建 方式一
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = i;
        }
        System.out.println(a[5]);

        // 动态创建 方式二
        double[] b;
        b = new double[2];
        System.out.println(b[0]);

        // 静态创建 方式一
        byte[] c = {1, 2, 4};
        System.out.println(c[2]);
        // 静态创建 方式二
        String[] d = new String[]{"1", "2", "3"};
        System.out.println(d[1]);
        // 静态创建 方式三
        char[] e;
        e = new  char[]{'a', 'b'};
        System.out.println(e[0]);
    }
}
