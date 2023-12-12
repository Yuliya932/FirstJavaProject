/*5. Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа).
*/
package lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        float number = in.nextFloat();

        float div1 = number / 1000;
        int div2 = (int) (div1 % 10);
        System.out.println(div2);

    }
}