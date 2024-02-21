package com.powernode.spring6.service;

public class jiandanService {
    public int num;
    public String age;

    public void setNum(int num) {
        this.num = num;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public String getAge() {
        return age;
    }

    public jiandanService(int num, String age) {
        this.num = num;
        this.age = age;
    }

    @Override
    public String toString() {
        return "jiandanService{" +
                "num=" + num +
                ", age='" + age + '\'' +
                '}';
    }

}
