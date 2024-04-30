/*используем библиотеку jsoup для подключения к сайту и получения его HTML-кода.
Затем мы ищем все ссылки на странице, используя метод "select()",
который принимает CSS-селектор, и выводим абсолютный URL каждой ссылки в консоль с помощью метода "attr()".*/
package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select ("a[href]");
            for (Element link : links){
                System.out.println(link.attr("abs:href"));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
