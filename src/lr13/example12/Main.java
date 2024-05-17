/*Пример 12. Исключение IllegalArgumentException – неверные аргументы.*/
package lr13.example12;

public class Main {
    public static void m(String str, double chislo) {
        if (str == null) {
            try {
                throw new IllegalArgumentException("Строка введена неверно");
            } catch (IllegalArgumentException e) {
                System.out.println("Строка введена неверно");
            }
            if (chislo > 0.001) {
                try {
                    throw new IllegalArgumentException("Неверное число");
                } catch (IllegalArgumentException e) {
                    System.out.println("Неверное число");
                }
            }
        }
    }

    public static void main(String[] args) {

        m(null, 0.1);
    }
}

