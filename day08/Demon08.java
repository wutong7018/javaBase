package cn.wt.day08;

import java.util.Scanner;

// 要求：输入一个字符串，统计大写字母，小写字母、数字等其它字符出现的次数
// 思路：
// 1. char 类型 比较大小自动提升到int，没有python好用
public class Demon08 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int countLower = 0;
        int countUpper = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] charsArray = input.toCharArray();
        for (char c : charsArray) {
            if (c >= 'A' && c <= 'Z') {
                countUpper++;
            } else if (c >= 'a' && c <= 'z') {
                countLower++;
            } else if (c >= '0' && c <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println(countLower);
        System.out.println(countUpper);
        System.out.println(countNumber);
        System.out.println(countOther);
    }

}
