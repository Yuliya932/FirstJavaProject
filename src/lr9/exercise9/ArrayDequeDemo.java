/*Продемонстрировать применения класса ArrayDeque */
package lr9.exercise9;


import java.util.ArrayDeque;

public class ArrayDequeDemo {

    public static void main(String args[] ){
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();
        //использовать класс ArrayDeque для организации стека
        adq.push("А");
        adq.push("В");
        adq.push("D");
        adq.push("Е");
        adq.push("F");
        System.out.print("Извлeчeниe из стека: ");
        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");
        System.out.println();
    }

    }
