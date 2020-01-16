package cn.wt.day08;

public class DemonCreate {
    public static void main(String[] args) {
        // 1. 直接创建
        String s1 = "Hello World";
        System.out.println(s1);
        // 2.通过字符数组创建
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println(str2);
        // 3.通过字节数组创建
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println(str3);
        // 4.创建空字符串
        String str4 = new String();
        System.out.println(str4);
    }
}
