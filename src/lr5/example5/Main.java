/*5. Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если метод вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля*/
package lr5.example5;

public class Main {
    public static void main(String[] args) {

        Test test1 = new Test();
        System.out.println(test1.getNumb());

        test1.setNumb(10);
        System.out.println(test1.getNumb());

        Test test2 = new Test(125);
        System.out.println(test2.getNumb());

        Test test3 = new Test(99);
        System.out.println(test3.getNumb());
    }
}
