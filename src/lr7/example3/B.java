/*3. Напишите программу, в которой на основе суперкласса создается подкласс, а на
основе этого подкласса создается еще один подкласс (цепочка наследования из трех
классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
параметром для присваивания значения полю и конструктор с одним параметром.

Во втором классе появляется открытое символьное поле, метод с двумя параметрами для
присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
параметрами.
В третьем классе появляется открытое текстовое ноле, метод с тремя
аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
чтобы он возвращал строку с названием класса и значениями всех полей объекта
* */
package lr7.example3;

public class B extends A {

 public char ch; //открытое символьное поле

 public B (int num, char ch){ //конструктор с двумя параметрами
  super(num);
  this.ch = ch;
 }


 public void setNum(int num, char ch) { //метод с двумя параметрами для присваивания значения полю
  super.setNum(num);
  this.ch = ch;
 }


 public int getNum(int num, char ch) {
  return super.getNum();
 }

 public char getCh() {
  return ch;
 }

 @Override
 public String toString(){
  String superClassNameAndFieldValue;
  superClassNameAndFieldValue =
          " Class name: " + this.getClass().getSimpleName() + "\n"+
                  " num = " + this.getNum() + "\n"+
                  " char = " + this.getCh();
  return superClassNameAndFieldValue;
 }

}
