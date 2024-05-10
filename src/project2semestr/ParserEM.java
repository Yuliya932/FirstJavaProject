package project2semestr;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class ParserEM {

    private static Document getPage() throws IOException {
        String url = "https://ekb.evraz.market/pricelist/armatura_gladkaya/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        Document page = getPage();

        Element tablePrs = page.select("Table[class=pricelist-section-table]").first();

        Elements values = tablePrs.select("tr");



        //Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("ЕвразМаркет");

        int index = 0;
        for (Element v : values) {
            int i = 0;
                Element valueLine = values.get(index);
                Row dataRow1 = sheet.createRow(index);
            for (Element td : valueLine.select("th")) {

                System.out.print(td.text() + "\t" + "\t" + "\t");
//                    Записываем данные в ячейки
                dataRow1.createCell(i).setCellValue(td.text());

                if ((i>=6) & (index == 0)){
                    System.out.print(td.text() + "\t" + "\t" + "\t");
                    i++;
//                    Записываем данные в ячейки
                    dataRow1.createCell(i).setCellValue(td.text());

                }
                i++;

            }
                for (Element td : valueLine.select("td")) {
                    System.out.print(td.text() + "\t" + "\t" + "\t");
//                    Записываем данные в ячейки
                    dataRow1.createCell(i).setCellValue(td.text());
                    i++;
                }
                System.out.println();
                index++;
        }
        //Записываем книгу Excel в файл
        String filePath = "src/project2semestr/example1.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}

