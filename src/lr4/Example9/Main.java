/*9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
необходимо реализовать собственный алфавит, остальные условия идентичны
задаче 8.
*/
package lr4.Example9;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char alfavit[] = { ' ', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я' };

//        System.out.println("съешь еще этих мягких французских булок да выпей чаю");
//        String value = "съешь еще этих мягких французских булок да выпей чаю";

        System.out.println("Введите текст для шифрования кириллицей с маленькой буквы");
        String value = in.nextLine();


        System.out.println("Введите ключ для шифрования ");
        int key = in.nextInt();

        char[] chars = value.toCharArray(); //преобразуем строку в массив символов

        int[] ints = new int[value.length()];

        System.out.println("chars до преобразования " + Arrays.toString(chars));

        for (int i = 0; i < chars.length; i++) {
            for ( int j = 0 ; j< alfavit.length; j++){
                if (chars[i] == alfavit [j]){
                    ints [i]=j+key; //прибавляем сдвиг по алфавиту
                }
            }
        }

        for (int i = 0; i < chars.length; i++) {
            if (ints [i] > 33){
                ints [i] = ints [i] - 34; // корректируем, если индекс вышел за пределы алфавита
            }
        }


        System.out.println("ints после преобразования " + Arrays.toString(ints));

        for (int i = 0; i < chars.length; i++) {
            for ( int j = 0 ; j< alfavit.length; j++){
                if (ints [i] == j){
                    chars[i] =  alfavit [j]; //заполняем массив chars
                }
            }
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
                    ints[i] = ints[i] - key; // вычитаем сдвиг
                }
                for (int i = 0; i < chars.length; i++) {
                    if (ints [i] < 0){
                        ints [i] = ints [i] + 34; // корректируем, если индекс стал отрицательным
                    }
                }


                System.out.println("ints после обратного преобразования " + Arrays.toString(ints));

                for (int i = 0; i < chars.length; i++) {
                    for ( int j = 0 ; j< alfavit.length; j++){
                        if (ints [i] == j){
                           chars[i] =  alfavit [j]; //заполняем массив chars
                        }
                    }
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
