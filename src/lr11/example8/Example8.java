/*Напишите функцию, которая принимает на вход список целых чисел и
возвращает новый список, содержащий только те числа, которые больше заданного значения.*/
package lr11.example8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n Список до: " + "\n");

        for (int i = 0; i<10; i++){
            integers.add(random.nextInt(10));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterNums(integers);

        System.out.println("\n Список, содержащий только те числа, которые больше заданного значения (> 5): " + "\n");

        for (Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> filterNums (List<Integer> list){
        return list.stream().filter(x -> x>5).collect(Collectors.toList());
    }
}
