package com.example.lib1;

public class FunctionsPractice {

    public static double averagePlus1(int a, int b, int c){
        double d = (a + b + c) / 3.0;
        return d + 1;
    }

    public static void main(String[] args) {
        int a = 65;
        int b = 5;
        int c = 78;
        double avg = (a + b + c) / 3.0;
        System.out.println(avg);
        System.out.println(averagePlus1(1, 2, 3));
        ClassEx cx = new ClassEx();
        cx.method1();
        InheritClassEx inheritClassEx = new InheritClassEx();
        inheritClassEx.method2();
        inheritClassEx.method1();
    }


}
