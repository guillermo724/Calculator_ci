package org.example;

public class Calculator {

        //variables shared by all "calculator" objects

        float PI = 3.14f;


     public void doNothing() {
        }

       public  int sum(int num1, int num2) {
            return num1 + num2;

        }

        public double sum(double num1, double num2) {
            return num1 + num2;
        }

        /**
         * Creation of a method or algorithm whichD
         * Receives a number as parameter and
         * return the square of the number as
         * result
         */


        public  float exponential(float base, int exponential) {
            float result = 1;

            for (int i = 0; i < Math.abs(exponential); i++) {
                result *= base;
            }

            if (exponential < 0) {
                return 1 / result;
            }
            return result;
        }


          public int square(int num) {
            return num * num;
        }

          public int square(float num) {
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
