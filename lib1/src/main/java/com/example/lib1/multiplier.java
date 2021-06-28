package com.example.lib1;

import java.util.ArrayList;
import java.util.Scanner;

public class multiplier {
    public static void main(String[] args) {
//        add();
//        mult();
//        pattern();
        weekday();
    }

    public static void mult() {
        int a = 7;
        for (int i = 1; i <= 10; i++){
            System.out.println(a + "  X  " + i + "  =  " + i * a);
        }

    }
    public static void add() {
        int sum = 0;
        int arr[] = {2, 3, 5, 7, 3, 9};
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Total sum is: " + sum);
    }

    public static void pattern(){
        for (int i = 0; i < 5; i++){
            for (int j = i; j < 5; j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }

    public static void weekday(){
        int day = 0;
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Write valid number");

        }
    }



}
