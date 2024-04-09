/*1. Напишите программу, в которой есть суперкласс с приватным текстовым полем,
конструктором с текстовым параметром и где переопределен метод toString (). На основе
суперкласса путем наследования создается подкласс. У него появляется еще одно
приватное текстовое ноле. Также подкласс должен иметь версии конструктора с одним и
двумя текстовыми аргументами, а еще в нем должен быть переопределен метод toString ().
В обоих классах метод toString () переопределяется так, что он возвращает строку с
названием класса и значение текстового поля или текстовых полей*/
package lr7.example1;

public class SuperClassTest {
    //закрытое текстовое поле
    private String str1;

    //конструктор с текстовым аргументом
    SuperClassTest (String strEx){
        this.str1 =  strEx;
    }

    SuperClassTest(){
    }

    //@Override - аннотация для того, чтобы показать, что мы собираемся переопределять метод суперкласса

    @Override
    public String toString(){
        String superClassNameAndFildValue;
        superClassNameAndFildValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n"+
                " str 1 = " + this.getStr1();
        return superClassNameAndFildValue;
    }

    public String getStr1(){
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
