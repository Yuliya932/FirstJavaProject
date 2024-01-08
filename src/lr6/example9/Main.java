/*
* 9. Напишите программу со статическим методом, аргументом которому передается
одномерный символьный массив. В результате вызова метода элементы массива попарно
меняются местами: первый — с последним, второй — с предпоследним и так далее*/
package lr6.example9;

import java.util.Arrays;

import static lr6.example9.Test.charsSort;

public class Main {
    public static void main(String[] args) {

        char[] ch1 = {'a', 'b', 'c','п', 'р', 'и', 'в', 'е', 'т', '!'};
        char[] result = charsSort(ch1);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(result));
    }

}

