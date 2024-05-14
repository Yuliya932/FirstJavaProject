package zzz.parseV;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.SAXException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.net.URL;

public class Main {
    private static Document getPage() throws IOException {
        String url = "https://vk.com/aeroflot/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, XMLStreamException,
            TransformerException, AddressException, MessagingException, IOException {
        Document page = getPage();
        Element tablePrs = page.select("div class=replies").first();
//        Elements values = tablePrs.select("tr");
        System.out.println(tablePrs);

        //Создаем новую книгу Excel
//        XSSFWorkbook workbook = new XSSFWorkbook();

        //Создаем новый лист в книге
//        XSSFSheet sheet = workbook.createSheet("ЕвразМаркет");

        int index = 0;
//        for (Element v : values) {
//            int i = 0;
//            Element valueLine = values.get(index);
//            Row dataRow1 = sheet.createRow(index);
//            for (Element td : valueLine.select("th")) {
////                    Записываем данные в ячейки
//                dataRow1.createCell(i).setCellValue(td.text());
////                if ((i >= 6) & (index == 0)) {
////                    i++;
//////                    Записываем данные в ячейки
////                    dataRow1.createCell(i).setCellValue(td.text());
////                }
//                i++;
//            }
//            for (Element td : valueLine.select("td")) {
////                    Записываем данные в ячейки
//                dataRow1.createCell(i).setCellValue(td.text());
//                i++;
//            }
//            index++;
//        }

    }
}
