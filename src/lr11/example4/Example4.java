/*Напишите функцию, которая принимает на вход
список чисел и возвращает новый список,
содержащий квадраты этих чисел.*/
package lr11.example4;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n Список до: " + "\n");

        for (int i = 0; i<10; i++){
            integers.add(random.nextInt(10));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = squareList(integers);

        System.out.println("\n Список после возведения в квадрат: " + "\n");

        for (Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> squareList (List<Integer> list){
        return list.stream().map(x -> x*x).collect(Collectors.toList());
    }
}
