/*5. Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строки и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.*/
package lr4.Example5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int i, j;

        int[][] arrayInt = new int[a][b];

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                arrayInt[i][j]  = random.nextInt(200);
            }
        }

        System.out.println(Arrays.deepToString(arrayInt));
        for (  i = 0 ; i < a ; i++){
            System.out.print("номер строки: " + (i+1) + " ; ");
            for (  j = 0 ; j < b ; j++){
                System.out.print(arrayInt[i] [j] + " ");
            }
            System.out.println(" Количество символов в строке " + j);
        }
        int[][] arrayInt2 = new int[b][a];

        for (i = 0; i < b; i++) {
            for (j = 0; j < a; j++) {
                arrayInt2[i][j]  = arrayInt[j][i];
            }
        }
        System.out.println("Массив после транспонирования:  ");

        System.out.println(Arrays.deepToString(arrayInt2));
        for (  i = 0 ; i < b ; i++){
            System.out.print("номер строки: " + (i+1) + " ; ");
            for (  j = 0 ; j < a ; j++){
                System.out.print(arrayInt2[i] [j] + " ");
            }
            System.out.println(" Количество символов в строке " + j);
        }

    }
}
