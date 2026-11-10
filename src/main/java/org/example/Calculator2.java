package org.example;

/**
 * @author Guillermo
 * @created 03/11/2026
 *
 */
public class Calculator2 {
    /**
     * A final decorated variable can not be modified its value
     * On the other hand, a final variable can only
     * be anitialized
     * "static"
     * Static variables are object specific
     * The variable "PI" should be independent from
     * any specific object.
     */
    public static final float PI = 3.14f;
    static int size = 3;
    public static int sum(int num1, int num2){
        size++;
        return num1 + num2;
    }
}
