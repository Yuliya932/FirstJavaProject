/*Листинг 1. Пример программы, которая выводит на консоль Прямоугольник со сторонами, ширина: 23 символов,
высота: 11 строк
*/
package lr4.Example1;

public class Main {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;

        for ( i = 1 ; i <= figure ; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -12 ; j< figure ; j++){
                System.out.print("+");
                z = z + 1;

            }
            System.out.println(" Количество символов в строке " + z);
        }

    }
}
