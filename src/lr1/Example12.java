/*7. Напишите программу, в которой по возрасту определяется год рождения.*/

package lr1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите возраст: ");
        int Age = in.nextInt();

        int currentYear = 2023;

        int yearOfBirth = currentYear - Age;


        System.out.println("Год рождения: " + yearOfBirth);

        in.close();

    }
}
