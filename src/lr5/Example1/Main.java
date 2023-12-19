/*1. Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода. Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа. Третий
метод позволяет вывести в консольное окно символ (значение поля) и его код
*/
package lr5.Example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

        test.setCh1('s');
        System.out.println(test.getCode());

        test.showCodeAndSymbol();

//        Scanner scanner = new Scanner(System.in);


    }
}
