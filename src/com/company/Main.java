package com.company;

public class Main {

    public static void main(String[] args) {
        double[] array = {2.5, -3.4, 25.5, -2.3, 7.4, 214.5, -15.5
                , 11.5, -45.6, 0.9, 55.4, 5.9, -23.4, -34.3, 24.8};
        boolean isNegative = false;
        double summa = 0;
        int length  = 0;
        for (double wall : array) {
            if (wall < 0) {
                isNegative = true;
            } else if(isNegative){
                if(wall > 0){
                    summa = summa + wall;
                    length++ ;
                }
            }
        }
        System.out.println("Среднее арифметическое положительных чисел = "+summa / length);
    }
}
