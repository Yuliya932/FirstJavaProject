/*Пример 10. Генерация исключительной ситуации в методе. Использование оператора return в секциях try и finally.*/
package lr13.example10;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            return 15;
        } finally {
            System.out.println("1");
            return 20;
        }
    }

    public static void main(String[] args) {
        System.out.println(m());
    }
}
