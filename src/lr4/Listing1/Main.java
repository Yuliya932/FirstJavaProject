/*Листинг 1. Пример программы, которая выводит на консоль Прямоугольник со сторонами, ширина: 15 символов,
высота: 10 строк
*/
package lr4.Listing1;

public class Main {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int z;

        for ( i = 1 ; i <= figure ; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -5 ; j< figure ; j++){
                System.out.print("+");
                z = z + 1;

            }
            System.out.println(" Количество символов в строке " + z);
        }

    }
}
