package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double divAndDifference(double first, double second) {
        return div(first, second)
             + difference(first, second);
    }

    public static double sumAll(double first, double second) {
        return div(first, second)
                + difference(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен " + sumAndMultiply(10, 20) + ", " + divAndDifference(40, 10) + ", " + sumAll(24, 8));
    }
}
