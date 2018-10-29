package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //fómula A=PI*r^2
        //pedir radio del círculo y calcular su área.

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio r=");
        System.out.println("Halla el área del círculo");

        double radio;
        radio = sc.nextFloat();
       double area =Math.pow(radio,2)*(3.14);

       System.out.println("Área =" + area);



       sc.close();



    }
}
