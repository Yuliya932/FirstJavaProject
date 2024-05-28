/*Задание 2
В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры, могут возникать ошибки в следующих случаях:
–	ввод строки вместо числа;
–	нет столбца с таким номером.
/////
–	определить экспериментально, ошибки каких классов будут сгенерированы;
–	создать обработчики исключительных ситуаций с использованием выявленных классов
и всех секций конструкции обработчика с соответствующими сообщениями, позволяющими корректно выполнить программу.

*/
package lr13.example16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        int N=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите индекс столбца из матрицы 10х10");
        try {
        N = scan.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
            return;
        }
        solve(N,fill(10));
    }

    public static int[][]fill(int N){
        int[][]arr = new int[N][N];
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++) {
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void solve(int N,int[][]arr) {
        try{
                for(int i = 0;i<arr[N].length;i++) {
                    System.out.print(arr[i][N]);
                    System.out.println();
                }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());

        }
    }
}
