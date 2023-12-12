/*8. Напишите программу для вычисления суммы двух чисел.
Оба числа вводятся пользователем.
Для вычисления суммы используйте оператор +.*/

package lr1;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float firstNumber = in.nextFloat();

        System.out.println("Введите второе число: ");
        float secNumber = in.nextFloat();

        float Sum = firstNumber + secNumber;

        System.out.println("Первое число: " + firstNumber);
        System.out.println("Второе число: " + secNumber);
        System.out.println("Сумма: " + Sum);

        in.close();
    }
}
