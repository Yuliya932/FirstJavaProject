/*Напишите функцию, которая принимает на вход список строк и
возвращает новый список, содержащий только те строки,
которые содержат только буквы (без цифр и символов).*/
package lr11.example9;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        String string = "Сколько костюмов у Хамелеона?\n" +
                "Может быть, 2, может, 3000000.\n";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после сплитования: " + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterCharStrings(strings);

        System.out.println("\n Строка после преобразования: " + "\n" );
        for (String e : stringAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterCharStrings (List<String> list){
        return  list.stream()
                .filter(s -> Character.isLetter(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
