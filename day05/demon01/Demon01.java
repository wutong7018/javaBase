package cn.wt.day05.demon01;
// overload
public class Demon01 {
    public static void main(String[] args) {
        int result;
        result = isSum(10.0, 5);
        System.out.println(result);
//        System.out.println(result);
    }

    public static int isSum(int a, int b){
        return a+b;
    }

    public static int isSum(int a, int b, int c){
        return a+b+c ;
    }

    public static int isSum(double a, int b){
        return (int)(a+b) ;
    }

    public static int isSum(int a, double b){
        return (int)(a+b);
    }
}
