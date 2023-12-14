/*6. Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
*/
package lr4.Example6;

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
                arrayInt[i][j] = random.nextInt(200);
            }
        }

        System.out.println(Arrays.deepToString(arrayInt));
        for (i = 0; i < a; i++) {
            System.out.print("номер строки: " + (i + 1) + " ; ");
            for (j = 0; j < b; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println(" Количество символов в строке " + j);
        }

        int x = random.nextInt(a);
        int y = random.nextInt(b);
        System.out.println("Удаляем строку с индексом: " + x + "; столбец с индексом: " + y);
        System.out.println("Массив после удаления строки и столбца: ");

        int[][] arrayInt2 = new int[a - 1][b - 1];

        for (int n = 0, ii = 0; ii < a-1; n++, ii++) {
            if (n == x) {
                ii--;
                continue;
            }
            for (int m = 0, jj = 0; jj < b-1; m++, jj++) {

                if (m == y) {
                    jj--;
                    continue;
                }
                arrayInt2[ii][jj] = arrayInt[n][m];
//                System.out.print(arrayInt2[ii][jj] + " "); //процесс заполнения массива
//                System.out.println(Arrays.deepToString(arrayInt2));//процесс заполнения массива

            }
        }

        System.out.println(Arrays.deepToString(arrayInt2));
        for (  i = 0 ; i < a-1 ; i++){
            System.out.print("номер строки: " + (i+1) + " ; ");
            for (  j = 0 ; j < b-1 ; j++){
                System.out.print(arrayInt2[i] [j] + " ");
            }
            System.out.println(" Количество символов в строке " + j);
        }




    }
}
