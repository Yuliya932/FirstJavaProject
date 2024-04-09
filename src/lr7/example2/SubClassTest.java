/*2. Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс.

В подклассе появляется дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
* */
package lr7.example2;

public class SubClassTest extends SuperClassTest {
    public int num;

    public SubClassTest (){ //  конструктор без параметров
        super("Присвоили константу");
    }

    public SubClassTest (String str1){
        super(str1); // вызвать конструктор из суперкласса
    }

    public SubClassTest (int num){ //  конструктор для целочисленного параметра
        this.num = num;
    }

    public SubClassTest (int num, String str1){
        super(str1); // вызвать конструктор из суперкласса
        this.num = num;
    }

    @Override
    public String getStr1(){ //метод без параметров
        return super.getStr1();
    }

    public int getNum() {
        return num;
    }

    @Override
    public void setStr1 (String str1){ // метод с одним текстовым параметром
        super.setStr1(str1);
    }

    public void setStr1 (int num){ // метод с целочисленным параметром
        this.num = num;
    }

    public void setStr1 (int num, String str1){ // метод с текстовым и целочисленным параметром
        super.setStr1(str1); // вызвать конструктор из суперкласса
        this.num = num;
    }
    @Override
    public void setConstValue (){
        super.setConstValue();
    }

    @Override
    public int getStringLength (){
        return super.getStringLength();
    }

}
