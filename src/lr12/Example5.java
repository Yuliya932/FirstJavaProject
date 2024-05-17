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
//            myList = [706, 575, 855, 882, 595, 778, 477, 602, 147, 467, 693, 793, 120, 384, 256, 866, 548, 367, 910, 848];
//                    "206 232 632 315 743 823 620 111 279 548 210 393 791 815 519 768 168 484 780 705",
//                    "709 127 900 171 189 590 563 317 600 975 892 296 166 353 863 312 399 872 964 591",
//                    "302 869 679 157 419 485 325 290 739 149 407 648 688 474 311 177 318 611 348 557",
//                    "559 283 171 352 698 759 384 822 598 410 802 293 962 859 812 153 436 392 869 167"};
//                myList.add(7);
//                    myList.add(18);
//                    myList.add(10);
//                    myList.add(24);
//                    myList.add(17);
//                    myList.add(5);

                    System.out.println("Иcxoдный список: " + myList);
//получить поток элементов списочного массива
                    Stream<Integer> myStream = myList.parallelStream();
//получить минимальное и максимальное значения,
                    // вызвав методы min(), max()
                    Optional<Integer> minVal = myStream.min(Integer::compare);
                    if(minVal.isPresent()) System.out.println(
                            "Минимальное значение: " + minVal.get());
                    // непременно получить новый поток данных,
//поскольку предыдущий вызов метода min()
//стал оконечной операцией, употребившей поток данных
                            myStream = myList.parallelStream();
                    Optional<Integer> maxVal = myStream.max(Integer::compare);
                    if(maxVal.isPresent()) System.out.println(
                            "Максимальное значение: " + maxVal.get());

    }

}
