package cn.wt.day08;

public class Demon03Get {
    public static void main(String[] args) {
        String str1 = "Hello llWorld";
        int thisIndex = str1.indexOf("ll");
        System.out.println(thisIndex);
        // 3. indexOf 不存在， 返回值为 -1 和 python一样
        System.out.println(str1.indexOf("gh"));
        // 1. charAt
        char thisChar = str1.charAt(2);
        System.out.println(thisChar);
        // 2. length()
        System.out.println(str1.length());
        // 4.concat 连接字符串
        String str2 = "Hello llWorld";
        String str3 = "how are you?";
        String concatStr = str2.concat(str3);
        System.out.println(concatStr);
    }
}
