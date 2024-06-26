/*
Пример 1. Для заданного параметра x вывести последовательность значений элементов числового ряда в соответствии со следующими требованиями:
•	очередной элемент x = 2*x+1 (новое значение вычисляется с использованием старого);
•	0 ≤ x < 20.
*/

package lr9.example1;

public class Recursion {
    public static void m(int x) {
        System.out.println("x= " + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        m(1);
    }
}

