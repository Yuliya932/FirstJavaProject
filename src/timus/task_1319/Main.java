/*1319. Отель
        Ограничение времени: 1.0 секунды
        Ограничение памяти: 64 МБ

Исходные данные
Целое число N (1 ≤ N ≤ 100) – размер таблички.
Результат
Табличка, помеченная циферками, как она будет стоять в мастерской.
Номер один должен находиться в правом верхнем углу,
далее ячейки нумеруются по диагоналям сверху вниз, последний номер (N*N) стоит в левом нижнем углу.
Пример
исходные данные
3

результат
4 2 1
7 5 3
9 8 6

        */
package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива: ");
        int a = in.nextInt();
//        System.out.println("Введите количество столбцов массива: ");
        int b = a;

        int i = 0;
        int j = 0;
        int d = 1; //колво чисел в диагонали

        int number = 1; // этим числом наполняем массив

        int m = 0; // ограничитель при заполнении по столбцам и номер строки при заполнении по строкам
        int n = 0;

        int[][] arrayInt = new int[a][b];
//        for( d = 1 ; d <a;d++){
//        for(i=0, j=a-1; i<=a-2;)
//
//        for (i=0, j=0; i<a;i++){
//            arrayInt[i][j] = a+1+i;
//            j++;
//        }
        int length = arrayInt.length;
        int diagonalLines = (length + length) - 1;
        int midPoint = (diagonalLines / 2) + 1;
        int itemsInDiagonal = 0;
        int rowIndex;
        int columnIndex;

        if (i <= midPoint) {
            itemsInDiagonal++;
            for ( j = a-1, i=0; j >=0; j--) {

                rowIndex = (j - i) ;
                columnIndex = j;
//                items.append(arrayInt[rowIndex][columnIndex]);
                arrayInt[rowIndex][columnIndex] = number;
                number++;
                i++;
            }
        } else {
            itemsInDiagonal--;
            for (j = 0,i=0; j < itemsInDiagonal; j++) {
                i++;
                rowIndex = (length - 1) - j;
                columnIndex = (i - length) + j;
//                items.append(arrayInt[rowIndex][columnIndex]);
                arrayInt[rowIndex][columnIndex] = number;
                number++;
            }
        }





//        if (a>= b) { //условие при различии в колве строк и столбцов

//        int d = 1;
//        for (d = 1; d<= a ; d++){
//
//        }

//        for (n = 0; n < b; n++) { // чикл, который содержит в одной итерации заполнение по 1 строке и 1 столбцу
//
//            for (i = m, j = b - m-1; j >=0; j--) { // заполнение по строке справо  налева
//                arrayInt[i][j] = number;
//                number++;
//            }
//            m++;
//            for (i = a - 1, j = b - m; i >= m; i--) { // заполнение по столбцу снизу вверх
//                arrayInt[i][j] = number;
//                number++;
//            }
//        }
//        }

        for (i = 0; i < a; i++) {
//            System.out.print("номер строки: " + (i + 1) + " ; ");
            for (j = 0; j < b; j++) {
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println("" );
        }

//        System.out.println(9/2);
    }
}
