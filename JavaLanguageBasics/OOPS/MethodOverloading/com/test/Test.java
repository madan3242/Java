package com.test;

public class Test{
    public void m1(){
        System.out.println("m1() method : no argument");
    }
    public void m1(int i){
        System.out.println("m1() method : int arument type");
    };
    public void m1(int i, int j){
        System.out.println("m1() method : multiple arument type");
    };
    public int m1(float f){
        System.out.println("m1() method : float arument type");
        return 10;
    };
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.m1(10);
        t1.m1(12.43f);

        t1.m1();

        t1.m1(12, 16);
    }
}