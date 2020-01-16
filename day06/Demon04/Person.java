package cn.wt.day06.Demon04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    // 成员变量
    String name;
    private int age;
    private boolean sex;

    public void setAge(int age) {
        if (age > 0 && age < 100){
            this.age = age;
        } else {
            System.out.println("数据不正确");
        }

    }

    public int getAge() {
        return age;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isSex() {
        return sex;
    }

    // 成员方法
    public void info(){
        System.out.println("大家好，我叫" + name + ", 性别"+ sex +",我今年" + age + "岁!!!");
    }
}
