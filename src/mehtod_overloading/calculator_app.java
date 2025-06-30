package mehtod_overloading;

import java.util.Scanner;

public class calculator_app {
	 public int add(int a, int b) {
	        return a + b;
	    }
	 public int add(int a, int b, int c) {
	        return a + b + c;
	    }
	 public int add(int a, int b, int c, int d) {
	        return a + b + c + d;
	    }
	 public int sub(int a, int b) {
	        return a - b;
	    }
	 public int sub(int a, int b, int c) {
	        return a - b - c;
	    }
	 public int sub(int a, int b, int c, int d) {
	        return a - b - c - d;
	    }
	 public int mul(int a, int b) {
	        return a * b;
	    }
	 public int mul(int a, int b, int c) {
	        return a * b * c;
	    }
	 public int mul(int a, int b, int c, int d) {
	        return a * b * c * d;
	    }
	 public int div(int a, int b) {
	        return a / b;
	    }
	 public int div(int a, int b, int c) {
	        return a / b / c;
	    }
	 public int div(int a, int b, int c, int d) {
	        return a / b / c / d;
	    }


    public static void main(String[] args) {
    	calculator_app calc = new calculator_app();
    	Scanner sc=new Scanner(System.in);
        System.out.println("Addition of 2 numbers: " + calc.add(10, 20));
        System.out.println("subtraction of 2 numbers: " + calc.sub(10, 20));
        System.out.println("multiplication of 2 numbers: " + calc.mul(10, 20));
        System.out.println("divition of 2 numbers: " + calc.div(10, 20));

      
    }
}
