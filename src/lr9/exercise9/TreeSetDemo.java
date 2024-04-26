/*Продемонстрировать применение класса TreeSet*/
package lr9.exercise9;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String args[]) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>();
        // ввести элементы в древовидное множество типа TreeSet
        ts.add("С ");
        ts.add("А");
        ts.add("в");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
//        System. out .println ( ts. subSet ("С", "F"));
    }
}
