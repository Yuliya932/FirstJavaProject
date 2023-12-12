/*2. Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.*/
package lr3.Example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели с заглавной буквы");
        String dayWeek = in.nextLine();

//      версия программы на основе условных операторов

        if (dayWeek.contains("Понедельник") ){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 1");
        } else  if (dayWeek.contains("Вторник") ){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 2");
        } else  if (dayWeek.contains("Среда")){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 3");
        } else  if (dayWeek.contains("Четверг")){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 4");
        } else  if (dayWeek.contains("Пятница")){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 5");
        } else  if (dayWeek.contains("Суббота")){
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 6");
        } else  if (dayWeek.contains("Воскресенье")) {
            System.out.println("Версия программы if: Порядковый номер дня в неделе: 7");
        } else {
            System.out.println("Версия программы if: Такого дня нет");
        }

//      версия программы на основе оператора выбора switch
        switch (dayWeek) {
            case "Понедельник" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 1");
                break;
            case "Вторник" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 2");
                break;
            case "Среда" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 3");
                break;
            case "Четверг" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 4");
                break;
            case "Пятница" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 5");
                break;
            case "Суббота" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 8");
                break;
            case "Воскресенье" :
                System.out.println("Версия программы switch: Порядковый номер дня в неделе: 7");
                break;
            default:
                System.out.println("Версия программы switch: Такого дня нет");

        }



    }
}