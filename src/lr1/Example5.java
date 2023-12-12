/*создадим программу для ввода информации о человеке показанной на листинге 5.
 * Обратите внимание для ввода значения типа float
 * (то же самое относится к типу double)
 * применяется число "180,5", где разделителем является запятая,
 * а не "180.5", где разделителем является точка.*/

package lr1;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        int age = in.nextInt();

        System.out.println("Input height: ");
        float height = in.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        in.close();

    }
}