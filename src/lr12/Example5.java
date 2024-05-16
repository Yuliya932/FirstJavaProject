/*5. Напишите функцию, которая находит максимальный элемент
в массиве целых чисел при помощи многопоточности.
Количество потоков должно быть равно количеству ядер процессора.*/
package lr12;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {

            // создать списочный массив значений типа Integer
            ArrayList<Integer> myList = new ArrayList<>();
                myList.add(7);
                    myList.add(18);
                    myList.add(10);
                    myList.add(24);
                    myList.add(17);
                    myList.add(5);

                    System.out.println("Иcxoдный список: " + myList);
//получить поток элементов списочного массива
                    Stream<Integer> myStream = myList.stream();
//получить минимальное и максимальное значения,
                    // вызвав методы min(), max()
                    Optional<Integer> minVal = myStream.min(Integer::compare);
                    if(minVal.isPresent()) System.out.println(
                            "Минимальное значение: " + minVal.get());
                    // непременно получить новый поток данных,
//поскольку предыдущий вызов метода min()
//стал оконечной операцией, употребившей поток данных
                            myStream = myList.stream();
                    Optional<Integer> maxVal = myStream.max(Integer::compare);
                    if(maxVal.isPresent()) System.out.println(
                            "Максимальное значение: " + maxVal.get());

    }

}
