package cn.wt.day06;

public class Demon02 {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);
        // 对象 做为 参数， 注意传递的是地址
        int res = isSum(stu, 100, 200);
        System.out.println(res);
    }

    public static int isSum(Student stu, int a, int b){
        System.out.println(stu);
        int result = stu.score(a, b);
        return result;
    }
}
