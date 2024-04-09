/*3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром. Во
втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами.
В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами.
Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта
* */
package lr7.example3;

public class C extends B {

    public String str; //открытое текстовое поле

    public C (int num, char ch, String str){ //конструктор с 3 параметрами
        super(num, ch);
        this.str = str;
    }

    public void setNum(int num, char ch, String str) { //метод с 3 параметрами для присваивания значения полю
        super.setNum(num, ch);
        this.str = str;
    }


    public int getNum(int num, char ch, String str) {
        return super.getNum();
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString(){
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n"+
                        " num = " + this.getNum() + "\n"+
                        " char = " + this.getCh() + "\n"+
                        " txt = " + this.getStr();
        return superClassNameAndFieldValue;
    }
}
