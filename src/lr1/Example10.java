/*5. Напишите программу, в которой по году рождения определяется возраст пользователя.*/

package lr1;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int yearOfBirth = in.nextInt();

        int currentYear = 2023;

        int Age = currentYear - yearOfBirth;


        System.out.println("Возраст: " + Age);

        in.close();

    }
}
