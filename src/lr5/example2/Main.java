/*2. Напишите программу с классом, у которого есть два символьных поля и
метод. Он возвращает результат, и у него нет аргументов. При вызове метод
выводит в консольное окно все символы из кодовой таблицы, которые
находятся «между» символами, являющимися значениями полей объекта (из
которого вызывается метод). Например, если полям объекта присвоены
значения ‘A’ и ‘D’, то при вызове метода в консольное окно должны
выводиться все символы от ‘A’ до ‘D’ включительно.
*/
package lr5.example2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Test test = new Test();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый символ: ");
        char ch1 = scanner.next().charAt(0);
        System.out.println("Введите второй символ: ");
        char ch2 = scanner.next().charAt(0);

        test.SetSymb(ch1,ch2);

        test.printSymb();











    }

}
