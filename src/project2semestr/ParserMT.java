package project2semestr;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;

public class ParserMT {
    private static Document getPage() throws IOException {
        String url = "https://www.metallotorg.ru/info/pricelists/ekaterinburg/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    public static void main(String[] args) throws IOException{
//        System.out.println(getPage());
        Document page = getPage();
        //css query language
//        Element tableWth = page.select("div[id=content]").first();
//            System.out.println(tableWth);
        Element tablePrs = page.select("Table[id=MyTable]").first();
//            System.out.println(tableWth);
//        System.out.println(tablePrs);
        Elements names = tablePrs.select("thead[id=TheHead]");
        Elements values = tablePrs.select("tbody[id=TheBody]");

//        System.out.println(names);
//        System.out.println(values);

        int index = 0;

        for (Element name : names) {
//            String dateSting = name.select("th[id=dt]").text();
//            String date = getDateFromString(dateSting);
//            System.out.println("Дата\tЯвления\tТемпература \tДавл\tВлажность\tВетер");
//            System.out.print(date +"\t");
//            int iterationCount = printPartValues(values, index);
//            index = index + iterationCount;
            for (int i = 0; i < 10; i++) {
                Element valueLine = values.get(index + i);
                for (Element td : valueLine.select("td")) {
                    System.out.print(td.text() + "\t"+ "\t"+ "\t");
                }
                System.out.println();
            }

    }


}}

