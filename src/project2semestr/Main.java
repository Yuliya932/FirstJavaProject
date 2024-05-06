package project2semestr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Node;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            //Получаем HTML-код страницы
            Document doc = Jsoup.connect("https://mc.ru/prices/sortovojprokat.htm").get();

            //Извлекаем список новостей
            Elements newsParent = doc
                    .select("body > div > div > div > table > tbody" );

            //Создаем новую книгу Excel
            XSSFWorkbook workbook = new XSSFWorkbook();

            //Создаем новый лист в книге
            XSSFSheet sheet = workbook.createSheet("news");
            int k = 1;

            //Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    System.out.println("Тема : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));


                    System.out.println("Дата : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) +
                            "\n");

                    //Записываем данные в ячейки
                    Row headerRow = sheet.createRow(0);
                    headerRow.createCell(0).setCellValue("Дата");
                    headerRow.createCell(1).setCellValue("Тема");

                    Row dataRow1 = sheet.createRow(k);
                    dataRow1.createCell(0).setCellValue("Дата : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0));
                    dataRow1.createCell(1).setCellValue("Тема : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));

                    k++;
                }
            }
            //Записываем книгу Excel в файл
            String filePath = "src/project2semestr/example1.xlsx";
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (HttpStatusException e) {
            System.out.println("Invalid website");

//            Connection session = Jsoup.newSession()
//                    .timeout(20 * 1000)
//                    .userAgent("FooBar 2000");
//
//            Document doc2 = session.newRequest()
//                    .url("http://fat.urfu.ru/index.html")
//                    .get();
//            System.out.println(doc2);
        }
    }
}

