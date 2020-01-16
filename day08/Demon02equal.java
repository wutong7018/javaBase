package cn.wt.day08;

public class Demon02equal {
    public static void main(String[] args) {
        String str1 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println("abc".equals(str2));

        String str3 = "ABC123";
        String str4 = "aBc123";
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
