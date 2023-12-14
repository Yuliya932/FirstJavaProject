/*4. Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник;
*/
package lr4.Example4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину одной стороны треугольника");
        int a = in.nextInt();

        int i, j;

        int[][] arrayInt = new int[a][a];

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                arrayInt[i][j] = 2;
            }
        }
        for (i = 0; i < a; i++) {
            System.out.print("номер строки: " + (i+1) + " ");

            for (j = 0; j <= i; j++) {
                System.out.print(arrayInt[i][j]);

            }
            System.out.println(" Количество символов в строке " + j);
        }
    }
}
