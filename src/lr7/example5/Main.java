/*5. Напишите программу, в которой есть суперкласс с защищенным текстовым полем,
конструктор с текстовым параметром и метод, при вызове которого в консольном окне
отображается название класса и значение поля. На основе суперкласса создаются два
подкласса (оба на основе одного и того же суперкласса). В одном из классов появляется
защищенное целочисленное поле, там есть конструктор с двумя параметрами и
переопределен метод для отображения значений полей объекта и названия класса. Во
втором подклассе появляется защищенное символьное поле, конструктор с двумя
параметрами и переопределен метод, отображающий в консоли название класса и значения
полей. В главном методе создайте объекты каждого из классов. Проверьте работу метода,
отображающего значения полей объектов, для каждого из объектов. Вызовите этот же
метод через объектную переменную суперкласса, которая ссылается на объект
производного класса*/
package lr7.example5;

public class Main {
    public static void main(String[] args) {

        SuperClass a = new SuperClass("Hi");
        a.showInfo();

        SubClass1 b = new SubClass1("Hi",2);
        b.showInfo();

        SubClass2 c = new SubClass2("Hi",'o');
        c.showInfo();

        // присвоить переменной ссылки на объект типа SubClass1
        // ссылку на объект типа SuperClass
        SuperClass d = new SuperClass();
        d = b;
        d.showInfo();

        SuperClass e = new SuperClass();
        e = c;
        e.showInfo();

    }
}
