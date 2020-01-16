package cn.wt.day08;

public class Demon05Tran {
    public static void main(String[] args) {
        String str1 = "How are you?";
        // 1. toCharArray() 转换成 char[]
        char[] charsStr = str1.toCharArray();
        for (int i = 0; i < charsStr.length; i++) {
            System.out.println(charsStr[i]);
        }

        System.out.println("=========================");

        String str2 = "How are you?";
        byte[] bytesStr = str2.getBytes();
        for (int i = 0; i < bytesStr.length; i++) {
            System.out.println(bytesStr[i]);
        }

        String str3 = "习近平搞个人崇拜";
        String str4 = str3.replace("习近平", "***");
        System.out.println(str4);
    }
}
