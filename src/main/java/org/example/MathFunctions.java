package org.example;

public class MathFunctions {
    static double PI;
    static double E;



    public MathFunctions(double PI, double E) {
        this.PI = PI;
        this.E = E;
    }

    public double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

    public double calculateExponential(double power) {
        return Math.pow(E, power);
    }
    public double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2; // Yarim perimetr
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}