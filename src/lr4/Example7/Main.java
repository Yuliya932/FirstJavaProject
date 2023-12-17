/*7. Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.*/
package lr4.Example7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int a = in.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int i = 0;
        int j = 0;

        int number = 1; // этим числом наполняем массив

        int m = 0; // ограничитель при заполнении по столбцам и номер строки при заполнении по строкам
        int n = 0;

        int[][] arrayInt = new int[a][b];

        if (a>= b) { //условие при различии в колве строк и столбцов

            for (n = 0; n < b; n++) { // чикл, который содержит в одной итерации заполнение по 1 строке и 1 столбцу

                for (i = m, j = 0; j < b - m; j++) { // заполнение по строке слева направо
                    arrayInt[i][j] = number;
                    number++;
                }
                m++;
                for (i = a - 1, j = b - m; i >= m; i--) { // заполнение по столбцу снизу вверх
                    arrayInt[i][j] = number;
                    number++;
                }
            }
        } else { //условие при различии в колве строк и столбцов
            for (n = 0; n < a; n++) {

                for (i = n, j = 0; j < b - m; j++) {// заполнение по строке слева направо
                    arrayInt[i][j] = number;
                    number++;
                }
                m++;

                for (i = a - 1, j = b - m; i >= m; i--) {// заполнение по столбцу снизу вверх
                    arrayInt[i][j] = number;
                    number++;
                }
            }
        }

        for (i = 0; i < a; i++) {
            System.out.print("номер строки: " + (i + 1) + " ; ");
            for (j = 0; j < b; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println(" Количество символов в строке " + j);
        }

    }
}

