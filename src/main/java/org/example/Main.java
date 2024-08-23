package org.example;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions(3.141592653589793, 2.718281828459045);

        //Doira yuzini hisoblash
        double radius = 8;
        System.out.println("Doira yuzi= " + mathFunctions.calculateCircleArea(radius));

        //e ni darajaga oshirish
        double son = 12;
        System.out.println("e ni " + son + "-" + "darajasi teng= " + mathFunctions.calculateExponential(son));

        //Uchburchakni yuzini hisoblash
        double a= 12;
        double b= 5;
        double c= 15;
        System.out.println("Uchburchakni yuzi teng= "+mathFunctions.calculateTriangleArea(a,b,c));

    }

}