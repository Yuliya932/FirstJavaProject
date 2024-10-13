package lr3_1;

import java.util.Scanner;

public class Main {

    // Переведём число из десятичной системы в двоичную
    public static String convertDecimalToBinary(int decimal) {
        if(decimal<0) {
            String output = Integer.toBinaryString(decimal);
            return output;
        } else {
            String output = String.format("%32s", Integer.toBinaryString(decimal)).replace(' ', '0');
            return output;
        }
    }
    //метод сложения  целых чисел
    public static String ArithSum (int number1, int number2) {
        int sum = number1 + number2;
        String outputSum = Integer.toString( number1 + number2 ,2);
        return outputSum;
    }
    //метод вычитания целых чисел
    public static String ArithDiff (int number1, int number2) {
        int diff = number1 - number2;
        String outputDiff = Integer.toString(number1 - number2 ,2);
        return outputDiff;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел будете вводить? (1 или 2): ");
        int count = in.nextInt();

        if (count == 1) {
            System.out.println("Введите десятичное число: ");
            int number = in.nextInt();
            System.out.println("Чиcлo " + number + " в двоичной форме: " + convertDecimalToBinary(number));
        }
        if (count == 2) {
            System.out.println("Введите первое десятичное число: ");
            int number1 = in.nextInt();
            System.out.println("Введите второе десятичное число: ");
            int number2 = in.nextInt();

            System.out.println("Сумма чисел " + number1 + " и " + number2 + " в двоичной форме: " + ArithSum(number1,number2));
            System.out.println("Разность чисел " + number1 + " и " + number2 + " в двоичной форме: " + ArithDiff(number1,number2));
        }

    }
}
