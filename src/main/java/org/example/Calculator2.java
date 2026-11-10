package org.example;

/**
 * @author Guillermo
 * @created 03/11/2026
 *
 */
public class Calculator2 {

    //variables shared by all "calculator" objects

    static float PI = 3.14f;


    static public void doNothing() {
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    static public double sum(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Creation of a method or algorithm whichD
     * Receives a number as parameter and
     * return the square of the number as
     * result
     */


    public static float exponential(float base, int exponential) {
        float result = 1;

        for (int i = 0; i < Math.abs(exponential); i++) {
            result *= base;
        }

        if (exponential < 0) {
            return 1 / result;
        }
        return result;
    }


    static public int square(int num) {
        return num * num;
    }

    static public int square(float num) {
        return (int) (num * num);
    }

    /**
     * Generalization
     * Design an algorithm that is able to
     * calculate the exponential of any number
     *
     * @param args
     */


}
