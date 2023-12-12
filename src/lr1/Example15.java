/*10. Напишите программу, в которой Пользователь вводит два числа,
а программой вычисляется и отображается сумма и разность этих чисел.
 */

package lr1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float firstNumber = in.nextFloat();

        System.out.println("Введите второе число: ");
        float secNumber = in.nextFloat();

        float Sum = firstNumber + secNumber;
        float Diff = firstNumber - secNumber;

        System.out.println("Сумма: " + Sum);
        System.out.println("Разность: " + Diff);
        in.close();
    }
}