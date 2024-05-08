package project2semestr;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static Document getPage() throws IOException {
        String url = "https://www.pogoda.spb.ru/";
        Document page = Jsoup.parse(new URL(url),3000);
        return page;
    }

    private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");

    private static String getDateFromString (String stringDate) throws Exception{
        Matcher matcher = pattern.matcher(stringDate);
        if(matcher.find()){
            return matcher.group();
        }
        throw new Exception ("Can't extract date from string");
    }

    private void printForValues (Elements values, int index){
        for (int i = 0; i < 4; i++){
            Element valueLine = values.get(index);
            for (Element td : valueLine.select("td"));
            System.out.println(td.text() + "       ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Document page = getPage();
        //css query language
        Element tableWth = page.select ("table[class=wt]").first();
        System.out.println(tableWth);
        Elements names = tableWth.select("tr[class=wth]");
        Elements values = tableWth.select("tr[valign=top]");

        int index = 0;

        for (Element name : names){
            String dateSting = name.select("th[id=dt]").text();
            String date = getDateFromString(dateSting);
            System.out.println("      Явления       Температура   Давл     Влажность      Ветер");
            printForValues(values,index);


        }

    }
}
