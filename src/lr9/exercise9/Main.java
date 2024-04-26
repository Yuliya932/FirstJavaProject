package lr9.exercise9;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();
        List<Integer> arrayList = new ArrayList<>();
        TreeSet<String> ts = new TreeSet<String>();

        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTimeAddFirst(adq));
        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTimeAddLast(adq));
//        System.out.println("Время выполнения операции добавления arrayDeque = " + getRunningTimeAddMiddle(adq));

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTimeAddLast(arrayList));
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTimeAddFirst(arrayList));
        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTimeAddMiddle(arrayList));

        System.out.println("Время выполнения операции добавления treeSet = " + getRunningTimeLast(ts));
        System.out.println("Время выполнения операции добавления treeSet = " + getRunningTimeMiddle(ts));

        System.out.println(adq);
        System.out.println(arrayList);
        System.out.println(ts);

        System.out.println("Время выполнения операции удаления arrayDeque = " + getRunningTimeRemoveFirst(adq));
        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTimeRemoveFirst(arrayList));
        System.out.println("Время выполнения операции удаления treeSet = " + getRunningTimeRemoveFirst(ts));

        System.out.println(adq);
        System.out.println(arrayList);
        System.out.println(ts);

        System.out.println("Время выполнения операции удаления arrayDeque = " + getRunningTimeRemoveLast(adq));
        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTimeRemoveLast(arrayList));
        System.out.println("Время выполнения операции удаления treeSet = " + getRunningTimeRemoveLast(ts));

        System.out.println(adq);
        System.out.println(arrayList);
        System.out.println(ts);


        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTimeRemoveMiddle(arrayList));
        System.out.println("Время выполнения операции удаления treeSet = " + getRunningTimeRemoveMiddle(ts));

        System.out.println(adq);
        System.out.println(arrayList);
        System.out.println(ts);
        //там переделать методы под добавление одного элемента

        //создать новые объекты

        System.out.println("Время выполнения операции удаления arrayDeque = " + getRunningTimeRemoveLast(adq));
        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTimeRemoveLast(arrayList));
        System.out.println("Время выполнения операции удаления treeSet = " + getRunningTimeRemoveLast(ts));


    }

    private static long getRunningTimeAddFirst(ArrayDeque<String> list){//ArrayDeque Вводит заданный объект в голову двусторонней очереди.
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10; i++) {
            list.addFirst("adf"+i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayDeque<String> list){ //ArrayDeque Вводит заданный объект в хвост двусторонней очереди
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10; i++) {
            list.addLast("adl"+i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

//    private static long getRunningTimeAddMiddle(ArrayDeque<String> list) { //ArrayDeque Добавление в середину коллекции
//        // точка начала отсчета времени выполнения программы
//        long start = System.currentTimeMillis();
//        // блок кода в котором выполняется операция добавления
//
//        for (int i = 0; i < (list.size() / 2 + 10); i++) {
//            if (i >= list.size() / 2) {
//                list.push("adm" + i);
//            }
//        }
//            // точка окончания отсчета времени выполнения программы
//            long end = System.currentTimeMillis();
//            // вывод в консоль времени выполнения блока кода содержащего операцию
//            return end - start;
//        }



    private static long getRunningTimeAddLast(List<Integer> list){//ArrayList Вводит заданный объект в конец коллекции
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10; i++) {
            list.add(i*10);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddFirst(List<Integer> list){//ArrayList Вводит заданный объект в начало коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10; i++) {
            list.add(0,i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddMiddle(List<Integer> list){//ArrayList Вводит заданный объект в середину коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 + 10); i++) {
            if (i >= list.size() / 2) {
                list.add(i,i*100);
            }
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeLast(TreeSet<String> list){//TreeSet Вводит заданный объект в конец коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 10; i++) {
            list.add("tsl"+i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }


    private static long getRunningTimeMiddle(TreeSet<String> list){//TreeSet Вводит заданный объект в середину коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 + 10); i++) {
            if (i >= list.size() / 2) {
                list.add("tsm"+i);
            }
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    ///////////////////////////////////////////////

    private static long getRunningTimeRemoveFirst(ArrayDeque<String> list){ //ArrayDeque Удаление в начале коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.poll();
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayDeque<String> list){ //ArrayDeque Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.removeLast();
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(TreeSet<String> list){//TreeSet Удаление в начале коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.pollFirst();
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(TreeSet<String> list){//TreeSet Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.pollLast();
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(TreeSet<String> list){//TreeSet Удаление в середине коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 + 10); i++) {
            if (i >= list.size() / 2) {
                list.remove("tsm"+i);
            }
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(List<Integer> list){ //ArrayListУдаление в начале коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.remove(0);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(List<Integer> list){//ArrayList Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5; i++) {
            list.remove(list.size()-1);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(List<Integer> list){//ArrayList Удаление в середине коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 + 10); i++) {
            if (i >= list.size() / 2) {
                list.remove(list.size()/2);
            }
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    //////////////////////////////////////
    private static long getRunningTimeGetElement(List<Integer> list, int x){ //ArrayListполучения элемента по индексу
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
            list.get(x);
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }





}
