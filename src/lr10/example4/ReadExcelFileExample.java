/*Эта программа является примером чтения данных из файла Excel в формате XLSX
с использованием библиотеки Apache POI.
В начале программы мы импортируем необходимые классы из библиотеки Apache POI,
которые позволяют работать с Excel-файлами.
Затем мы определяем основной метод программы main, который выбрасывает исключение IOException,
связанное с чтением файла. Далее мы открываем файл Excel для чтения, используя объект FileInputStream.
Затем мы создаем экземпляр книги Excel из файла, используя класс XSSFWorkbook.
Далее мы получаем лист из книги по его имени, используя метод getSheet:
После этого мы перебираем все строки и ячейки на листе, используя цикл for.
Внутри цикла мы выводим на экран значение каждой ячейки с помощью метода toString(),
который преобразует значение ячейки в строку. В конце программы мы закрываем файл и
освобождаем ресурсы, используя методы close(): */
package lr10.example4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        //Открываем файл Excel для чтения
        String filePath = "src/lr10/example4/example4.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //Создаем экземляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        //Перебираем строки и ячейки листа
        for (Row row : sheet){
            for (Cell cell : row){
                //Выводит значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        //Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
