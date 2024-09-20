package project2semestr;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.SAXException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ParserEM {

    private static Document getPage() throws IOException {
        String url = "https://ekb.evraz.market/pricelist/armatura_gladkaya/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws ParserConfigurationException , SAXException, XMLStreamException,
            TransformerException, AddressException, MessagingException ,  IOException {
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
//                    Записываем данные в ячейки
                dataRow1.createCell(i).setCellValue(td.text());
                if ((i>=6) & (index == 0)){
                    i++;
//                    Записываем данные в ячейки
                    dataRow1.createCell(i).setCellValue(td.text());
                }
                i++;
            }
                for (Element td : valueLine.select("td")) {
//                    Записываем данные в ячейки
                    dataRow1.createCell(i).setCellValue(td.text());
                    i++;
                }
                index++;
        }
        //Записываем книгу Excel в файл
        String filePath = "src/project2semestr/price.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Данные записаны в файл: " + filePath);

        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\user\\IdeaProjects\\FirstJavaProject\\properties"));

        java.time.LocalDate currentDate = java.time.LocalDate.now();

        Session mailSession = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(mailSession); // Создание объекта сообщения
        message.setFrom(new InternetAddress("XXXXXo@yandex.ru"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("XXXXX51@gmail.com"));
        message.setSubject("Прайс Евраз Маркет " + currentDate);

        // Создание и заполнение первой части
        MimeBodyPart p1 = new MimeBodyPart();
        p1.setText("Добрый день! \nПрайс " + currentDate);

        // Создание второй части
        MimeBodyPart p2 = new MimeBodyPart();

        // Добавление файла во вторую часть
        FileDataSource fds = new FileDataSource("src/project2semestr/price.xlsx");
        p2.setDataHandler(new DataHandler(fds));
        p2.setFileName(fds.getName());

        // Создание экземпляра класса Multipart. Добавление частей сообщения в него.
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(p1);
        mp.addBodyPart(p2);

        message.setContent(mp);

        Transport tr = mailSession.getTransport();
        tr.connect(null,"XXXXXXXXX");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

        System.out.println("Сообщение отправлено!");
    }
}

