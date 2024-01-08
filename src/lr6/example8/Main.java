/*8. Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве)*/
package lr6.example8;

import java.util.Arrays;

import static lr6.example8.Test.avgInts;

public class Main {
    public static void main(String[] args) {

        int[] v = {1, 2, 3, 4, 5, 6};
        Test test = new Test();
        double r = test.avgInts(v);
        System.out.println(r);
    }
}
