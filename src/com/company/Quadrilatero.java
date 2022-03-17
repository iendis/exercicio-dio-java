package com.company;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("A area do quadrado e: " + lado * lado);
    }
    public static void area(double lado1, double lado2){
        System.out.println("A area do retangulo e: " + lado1 * lado2);
    }
    public static void area(double baseMenor, double baseMaior, double altura){
        System.out.println("A base do trapezio e: " + (baseMaior+baseMenor)/altura);
    }
}
