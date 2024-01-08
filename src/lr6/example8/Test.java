/*8. Напишите программу со статическим методом, аргументом которому передается
целочисленный массив, а результатом возвращается среднее значение для элементов
массива (сумма значений элементов, деленная на количество элементов в массиве)*/
package lr6.example8;

public class Test {
    static double avgInts (int[] n) {
//        if (n.length == 0)
//            return 0;

        double sum=0;

        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }

        return sum/n.length;
    }
}
