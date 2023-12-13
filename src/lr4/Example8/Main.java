/*8. Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».*/
package lr4.Example8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования ");
        String value = in.nextLine();

        System.out.println("Введите ключ для шифрования ");
        int key = in.nextInt();

        char[] chars = value.toCharArray(); //преобразуем строку в массив символов
        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования " + Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] + key; //заполняем массив чисел значениями строки
        }

        System.out.println("ints после преобразования " + Arrays.toString(ints));

        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ints[i]; //заполняем массив chars
        }
        System.out.println("chars после преобразования " + Arrays.toString(chars));

        System.out.println("Текст после преобразования:");

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println(" ");

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String c = in.next(); //сделала next(), так как попадало значение предыдущего ввода

            if ("y".equals(c)) {

                for (int i = 0; i < chars.length; i++) {
                    ints[i] = ints[i] - key;
                }

                System.out.println("ints после обратного преобразования " + Arrays.toString(ints));

                for (int i = 0; i < chars.length; i++) {
                    chars[i] = (char) ints[i]; //заполняем массив chars
                }
                System.out.println("chars после обратного преобразования " + Arrays.toString(chars));

                System.out.println("Текст после обратного преобразования:");
                for (int i = 0; i < chars.length; i++) {
                    System.out.print(chars[i]);

                }
                break;
            } else if ("n".equals(c))  {
                System.out.println("До свидания!");
                break;

            } else   {
                System.out.println("Введите корректный ответ!");
            }
        }
    }
}





