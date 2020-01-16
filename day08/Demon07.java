package cn.wt.day08;

// 要求： 定义一个方法将Array {1,  2, 3} 变成[world1#world2#world3]
public class Demon07 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        String changeStr = isChangeStr(intArray);
        System.out.println(changeStr);
    }

    public static String isChangeStr(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                str += "world" + array[i];
            } else {
                str += "world" + array[i] + "#";
            }
        }
        str += "]";
        return str;
    }
}
