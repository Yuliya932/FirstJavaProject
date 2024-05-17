/*Пример 8. Генерация исключения в методе.
* примеры с использованием конструкции try- finally.
* Перехват брошенного исключения catch не производится. Секция finally выполняется всегда.*/
package lr13.example8;

    public class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("00" + e);
            } finally {
                System.out.println("1");
            }
            return 22;
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }


