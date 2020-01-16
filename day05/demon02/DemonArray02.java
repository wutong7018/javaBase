package cn.wt.day05.demon02;

public class DemonArray02 {
    public static void main(String[] args) {
        int[] isInt = new int[10];
        System.out.println("数据类型整形的默认值:" + isInt[0]);   // 0

        double[] isDouble = new double[3];
        System.out.println("数据类型浮点型的默认数值：" + isDouble[2]);

        char[] isChar = new char[4];
        System.out.println("数据类型字符型的默认值：" + isChar[0]);

        boolean[] isBool = new boolean[2];
        System.out.println("布尔数据类型的默认值" + isBool[1]);


        String[] isOther = new String[4];
        System.out.println("引用数据类型的默认值" + isOther[1]);

        long[] isLong = {1, 2, 5, 3, 7, 9, 8, 10};
        for (int i = 0; i < isLong.length; i++) {
            System.out.print(isLong[i] + " ");
        }
        System.out.println();
        System.out.println(isLong.length);
    }
}

/* 打印结果：
数据类型整形的默认值:0
数据类型浮点型的默认数值：0.0
数据类型字符型的默认值：
布尔数据类型的默认值false
引用数据类型的默认值null*/
