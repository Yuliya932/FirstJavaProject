package timus.task_2001;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a1 = in.nextInt(); //масса брутто корзины с ягодами 1 математика
        int b1 = in.nextInt(); //масса брутто корзины с ягодами 2 математика
        int a2 = in.nextInt();
        int b2 = in.nextInt(); //масса пустой корзины  2 математика
        int a3 = in.nextInt(); //масса пустой корзины  1 математика
        int b3 = in.nextInt();

        int berries1 = a1 - a3; //масса нетто ягод 1 математика
        int berries2 = b1 - b2; //масса нетто ягод 2 математика

        System.out.println( berries1 + " " + berries2);
    }
}
