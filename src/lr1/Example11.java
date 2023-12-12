/*6. Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя и его возраст.
 */

package lr1;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String Name = in.nextLine();

        System.out.println("Год рождения: ");
        int yearOfBirth = in.nextInt();

        int Age = 2023 - yearOfBirth;

        System.out.println("Имя пользователя и его возраст: " + Name + " " + Age);


        in.close();
    }
}