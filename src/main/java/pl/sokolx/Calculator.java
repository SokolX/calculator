package pl.sokolx;

public class Calculator {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int substract(int b, int a) {
        return b-a;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(Calculator.add(5,6));
        System.out.println(Calculator.substract(5,6));

    }
}