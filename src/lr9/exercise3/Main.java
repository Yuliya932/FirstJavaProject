package lr9.exercise3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Recursion ob = new Recursion (10);
        Random random = new Random();
        int i;
        for (i = 0; i<10; i++) {
            ob.values[i] = random.nextInt(200);
        }
        ob.printArray (10);

    }
}
//рекурсивный метод printArray () выводит первые i элементов из массива values.
