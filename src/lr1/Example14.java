/*9. Напишите программу, в которой пользователь вводит число,
а программой отображается последовательность из четырех чисел:
число, на единицу меньше введённого,
введенное число
и число, на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
 */

package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        float Number = in.nextFloat();

        float first = Number - 1;
        float second = Number;
        float third = Number + 1;
        float fourth = ((Number - 1) + Number + (Number + 1)) * ((Number - 1) + Number + (Number + 1));

        System.out.println("Последовательность: " + first + " " + second + " " + third + " " + fourth);


        in.close();

    }
}
