package reserve;

import org.xml.sax.SAXException;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SendEmail {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XMLStreamException, TransformerException, AddressException, MessagingException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("C:\\Users\\DearUser3\\IdeaProjects\\FirstJavaProject\\properties"));

        java.time.LocalDate currentDate = java.time.LocalDate.now();

        Session mailSession = Session.getDefaultInstance(properties);

        MimeMessage message = new MimeMessage(mailSession); // Создание объекта сообщения
        message.setFrom(new InternetAddress("uuulio@yandex.ru"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("uliamaslova1951@gmail.com"));
        message.setSubject("Прайс Евраз Маркет " + currentDate);

        // Создание и заполнение первой части
        MimeBodyPart p1 = new MimeBodyPart();
        p1.setText("Добрый день! \nПрайс Евраз Маркет " + currentDate);

        // Создание второй части
        MimeBodyPart p2 = new MimeBodyPart();

        // Добавление файла во вторую часть
        FileDataSource fds = new FileDataSource("src/project2semestr/example1.xlsx");
        p2.setDataHandler(new DataHandler(fds));
        p2.setFileName(fds.getName());

        // Создание экземпляра класса Multipart. Добавление частей сообщения в него.
        Multipart mp = new MimeMultipart();
        mp.addBodyPart(p1);
        mp.addBodyPart(p2);

        message.setContent(mp);

        Transport tr = mailSession.getTransport();
        tr.connect(null,"Milashka!A");
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();

        System.out.println("Сообщение ушло!");
    }
}
