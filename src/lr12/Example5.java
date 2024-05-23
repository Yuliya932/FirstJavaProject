/*5. Напишите функцию, которая находит максимальный элемент
в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.*/
package lr12;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static int array[];

    public static int maxs[];

    public static int max;


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numbersCount = scanner.nextInt();
        System.out.println("Введите количество потоков");
        int threadsCount = scanner.nextInt();

        array = new int[numbersCount];
        maxs = new int[threadsCount];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        long startTime = System.currentTimeMillis();

        int realMax = 0;

        for (int i = 0; i < array.length; i++) {
            if(realMax < array[i]) {
                realMax = array[i];
            }
        }

        long time = System.currentTimeMillis() - startTime;

        System.out.println("Max через цикл - " + realMax);
        System.out.println("Время выполнения через цикл - " + time);

        //  реализовать работу с потоками
        long startTime1 = System.currentTimeMillis();

        int byThreadMax = 0;
        int numberOfElementsInOneThread = (int) Math.ceil((double) (numbersCount) / (double) (threadsCount));
        int[] maxs = new int[threadsCount];
        for (int i = 0; i < maxs.length; i++) {
            MaxThread MaxThread = new MaxThread(i * numberOfElementsInOneThread, (i + 1) * numberOfElementsInOneThread - 1);
            MaxThread.start();
            try {
                MaxThread.join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException();
            }
            maxs[i] = max;
            if (byThreadMax < maxs[i]) {
                byThreadMax = maxs[i];
            }
        }

        long time1 = System.currentTimeMillis() - startTime1;

        System.out.println("Max через потоки - " + byThreadMax);
        System.out.println("Время выполнения через потоки - " + time1);
    }
}
