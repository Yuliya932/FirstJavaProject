package lr9.exercise9;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();
        List<Integer> arrayList = new ArrayList<>();
        TreeSet<String> ts = new TreeSet<String>();

        System.out.println("Время выполнения операции заполнения arrayDeque = " + getRunningTimeAddAll(adq,1000000));
        System.out.println("Время выполнения операции заполнения arrayList = " + getRunningTimeAddAll(arrayList,1000000));
        System.out.println("Время выполнения операции заполнения treeSet = " + getRunningTimeAddAll(ts,1000000));

        System.out.println("Время выполнения операции добавления Last arrayDeque = " + getRunningTimeAddLast(adq));
        System.out.println("Время выполнения операции добавления First arrayDeque = " + getRunningTimeAddFirst(adq));
        System.out.println("Время выполнения операции добавления Last arrayList = " + getRunningTimeAddLast(arrayList));
        System.out.println("Время выполнения операции добавления First arrayList = " + getRunningTimeAddFirst(arrayList));
        System.out.println("Время выполнения операции добавления Middle arrayList = " + getRunningTimeAddMiddle(arrayList));
        System.out.println("Время выполнения операции добавления Last treeSet = " + getRunningTimeLast(ts));

        System.out.println("Время выполнения операции удаления First arrayDeque = " + getRunningTimeRemoveFirst(adq));
        System.out.println("Время выполнения операции удаления First arrayList = " + getRunningTimeRemoveFirst(arrayList));
        System.out.println("Время выполнения операции удаления First treeSet = " + getRunningTimeRemoveFirst(ts));

        System.out.println("Время выполнения операции удаления Last arrayDeque = " + getRunningTimeRemoveLast(adq));
        System.out.println("Время выполнения операции удаления Last arrayList = " + getRunningTimeRemoveLast(arrayList));
        System.out.println("Время выполнения операции удаления Last treeSet = " + getRunningTimeRemoveLast(ts));

        System.out.println("Время выполнения операции удаления Middle arrayList = " + getRunningTimeRemoveMiddle(arrayList));
        System.out.println("Время выполнения операции удаления Middle treeSet = " + getRunningTimeRemoveMiddle(ts));

        System.out.println("Время выполнения операции получения элемента по значению arrayDeque = " + getRunningTimeGetElement(adq));
        System.out.println("Время выполнения операции получения элемента по индексу arrayList = " + getRunningTimeGetElement(arrayList,100000));
        System.out.println("Время выполнения операции получения элемента по индексу treeSet = " + getRunningTimeGetElement(ts,100000));
    }

    private static long getRunningTimeAddAll(ArrayDeque<String> list,int x){//ArrayDeque заполнение
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9*x; i++) {
            list.add(""+i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddAll(List<Integer> list,int x){//ArrayList заполнение
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9*x; i++) {
            list.add(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddAll(TreeSet<String> list,int x){//TreeSet заполнение
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 9*x; i++) {
            list.add(""+ i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    /////////////////////////////////

    private static long getRunningTimeAddFirst(ArrayDeque<String> list){//ArrayDeque Вводит заданный объект в голову двусторонней очереди.
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.addFirst("adf");
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddLast(ArrayDeque<String> list){ //ArrayDeque Вводит заданный объект в хвост двусторонней очереди
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 10; i++) {
            list.addLast("adl");
//        }
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
//        for (int i = 0; i < 10; i++) {
            list.add(10);
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddFirst(List<Integer> list){//ArrayList Вводит заданный объект в начало коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.add(0,10);
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeAddMiddle(List<Integer> list){//ArrayList Вводит заданный объект в середину коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 ); i++) {
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
//        for (int i = 0; i < 10; i++) {
            list.add("add");
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }


//    private static long getRunningTimeMiddle(TreeSet<String> list){//TreeSet Вводит заданный объект в середину коллекции
//        // точка начала отсчета времени выполнения программы
//        long start = System.currentTimeMillis();
//        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < (list.size() / 2 + 1); i++) {
//            if (i >= list.size() / 2) {
//                list.add(""+i*10);
//            }
//        }
        // точка окончания отсчета времени выполнения программы
//        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
//        return end - start;
//    }

    ///////////////////////////////////////////////

    private static long getRunningTimeRemoveFirst(ArrayDeque<String> list){ //ArrayDeque Удаление в начале коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.poll();
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(ArrayDeque<String> list){ //ArrayDeque Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.removeLast();
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveFirst(TreeSet<String> list){//TreeSet Удаление в начале коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.pollFirst();
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(TreeSet<String> list){//TreeSet Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.pollLast();
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(TreeSet<String> list){//TreeSet Удаление в середине коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 + 1); i++) {
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
//        for (int i = 0; i < 1; i++) {
            list.remove(0);
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveLast(List<Integer> list){//ArrayList Удаление в конце коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
//        for (int i = 0; i < 1; i++) {
            list.remove(list.size()-1);
//        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeRemoveMiddle(List<Integer> list){//ArrayList Удаление в середине коллекции
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < (list.size() / 2 ); i++) {
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
        System.out.println(list.get(x));
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeGetElement(ArrayDeque<String> list){ //ArrayDeque получение элемента
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        System.out.println(list.peek());
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

//    private static long getRunningTimeGetElement(TreeSet<String> list){//TreeSet получение элемента
//        // точка начала отсчета времени выполнения программы
//        long start = System.currentTimeMillis();
//        // блок кода в котором выполняется операция добавления
//        System.out.println(list.ceiling("1"));
//        // точка окончания отсчета времени выполнения программы
//        long end = System.currentTimeMillis();
//        // вывод в консоль времени выполнения блока кода содержащего операцию
//        return end - start;
//    }

    private static long getRunningTimeGetElement(TreeSet<String> list,int x){//TreeSet получение элемента
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        Iterator<String> itr = list.iterator();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < list.size() ; i++) {
            if (i == x) {
                System.out.println(itr.next());
            }
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

}
