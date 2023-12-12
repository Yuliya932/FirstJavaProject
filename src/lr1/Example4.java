/*Пример программы, осуществляющей ввод чисел показан на листинге 4
* Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:

next(): считывает введенную строку до первого пробела
nextLine(): считывает всю введенную строку
nextInt(): считывает введенное число int
nextDouble(): считывает введенное число double
nextBoolean(): считывает значение boolean
nextByte(): считывает введенное число byte
nextFloat(): считывает введенное число float
nextShort(): считывает введенное число short
*/

package lr1;
import java.util.Scanner;
public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input a number:");
        int num = in.nextInt();

        System.out.println("Your number" + num);
        in.close();
    }
}