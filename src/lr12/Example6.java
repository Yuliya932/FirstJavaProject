/*6. Напишите функцию, которая суммирует элементы
в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.*/
package lr12;
import java.util.Random;
import java.util.Scanner;
public class Example6 {

    public static int array[];

    public static int sums[];

    public static int sum;


    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numbersCount = scanner.nextInt();
        System.out.println("Введите количество потоков");
        int threadsCount = scanner.nextInt();

        array = new int[numbersCount];
        sums = new int[threadsCount];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        long startTime = System.currentTimeMillis();

        int realSum = 0;

        for (int i = 0; i < array.length; i++) {
            realSum += array[i];
        }

        long time = System.currentTimeMillis() - startTime;

        System.out.println("Сумма через цикл - " + realSum);
        System.out.println("Время выполнения через цикл - " + time);

        // TODO: реализовать работу с потоками
        long startTime1 = System.currentTimeMillis();

        int byThreadSum = 0;
        int numberOfElementsInOneThread = (int) Math.ceil((double) (numbersCount) / (double) (threadsCount));
        int[] sums = new int[threadsCount];
        for (int i = 0; i < sums.length; i++) {
            SumThread SumThread = new SumThread(i * numberOfElementsInOneThread, (i + 1) * numberOfElementsInOneThread - 1);
            SumThread.start();
            try {
                SumThread.join();
            } catch (InterruptedException e) {
                throw new IllegalArgumentException();
            }
            sums[i] = sum;
            byThreadSum += sums[i];
        }

        long time1 = System.currentTimeMillis() - startTime1;

        System.out.println("Сумма через потоки - " + byThreadSum);
        System.out.println("Время выполнения через потоки - " + time1);
    }
}




