/*6. Напишите программу с классом, в котором есть два закрытых
целочисленных поля (назовем их max и min). Значение поля max не может
быть меньше значения поля min. Значения полям присваиваются с помощью
открытого метода. Метод может вызываться с одним или двумя
целочисленными аргументами. При вызове метода значения полям
присваиваются так: сравниваются текущие значения полей и значения
аргументов, переданных методу. Самое большое из значений присваивается
полю max, а самое маленькое из значений присваивается полю min.
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. В классе также должен быть метод,
отображающий в консольном окне значения полей объекта

*/
package lr5.example6;

public class Test {
    private int min; // Поле класса
    private int max;// Поле класса
    public Test (int min, int max) { // конструктор
            if(min <= max) {
                this.min = min;
                this.max = max;
            } else {
                this.min = max;
                this.max = min;
            }
        }

    public Test (int min) { // конструктор с одним аргументом
        this.min = min;
        this.max = min;
    }

    public void setMin(int min) { // метод сеттер
        this.min = min;
    }

    public void setMax(int max) { // метод сеттер
        this.max = max;
    }

    public void MinMax (int min, int max) { // метод
//        if(min <= max) {
            this.min = Math.min(max,min);
            this.max = Math.max(max,min);
            System.out.println("С помощью метода MinMax с 2 аргументами: min: " + this.min + " max: " + this.max);
    }

    public void MinMax (int min) { // метод с одним аргументом
        this.min = min;
        this.max = min;
        System.out.println("С помощью метода MinMax с 1 аргументом: min: " + min + " max: " + max);
    }

    public int getMin() { // метод геттер
        return min;
    }

    public int getMax() { // метод геттер
        return max;
    }
}

