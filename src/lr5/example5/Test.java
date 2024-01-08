/*5. Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля*/
package lr5.example5;

public class Test {
    private int numb; // поле класса

    public Test(){ // конструктор без аргументов,  поле получает нулевое значение
        this.numb = 0;
    }

    public Test (int numb) { // конструктор
        if (numb >100) {
            this.numb = 100;
        } else {
            this.numb = numb;
        }
    }

    public void Metod(){ // метод без аргументов,  поле получает нулевое значение
        this.numb = 0;
    }

    public void Metod (int numb) { // метод
        if (numb >100) {
            this.numb = 100;
        } else {
            this.numb = numb;
        }
    }

    public void setNumb(int numb) { // метод сеттер
        this.numb = numb;
    } // метод сеттер

    public int getNumb() {
        return numb;
    } // метод геттер
}