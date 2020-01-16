package cn.wt.day08;

public class Demon06S {
    public static void main(String[] args) {
        String str1 = "a,b,c,d";
        String[] splitArray = str1.split(",");
        for (int i = 0; i < splitArray.length; i++) {
            System.out.println(splitArray[i]);
        }
    }
}
