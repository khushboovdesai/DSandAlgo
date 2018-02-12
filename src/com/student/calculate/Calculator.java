package com.student.calculate;

public class Calculator {
    private int x;

    public Calculator(int x){
        this.x=x;
    }

    public int add (int a, int b){
        return a+b;
    }

    public int sub (int a, int b){
        return a-b;
    }

    public int div (int a, int b){
        return a/b;
    }

    public int mul (int a, int b){
        return a*b;
    }

    public int mod (int a, int b){
        return a%b;
    }
}
