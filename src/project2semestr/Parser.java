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
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    private static Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");

    private static String getDateFromString(String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string");
    }

    private static int printPartValues(Elements values, int index) {
        int iterationCount = 4;
        if (index == 0) {
            Element valueLn = values.get(3);
            boolean isMorning = valueLn.text().contains("Утро");
            if (isMorning) {
                iterationCount = 3;
            }
        } else if (index == 0) {
            Element valueLn = values.get(3);
            boolean isDay = valueLn.text().contains("День");
            if (isDay) {
                iterationCount = 2;
            }
        } else if (index == 0) {
            Element valueLn = values.get(3);
            boolean isEvening = valueLn.text().contains("Вечер");
            if (isEvening) {
                iterationCount = 1;
            }
        } else if (index == 0) {
            Element valueLn = values.get(3);
            boolean isNight = valueLn.text().contains("Ночь");
            if (isNight) {
                iterationCount = 0;
            }
        }
        for (int i = 0; i < iterationCount; i++) {
                Element valueLine = values.get(index + i);
                for (Element td : valueLine.select("td")) {
                    System.out.print(td.text() + "\t");
                }
                System.out.println();
        }
        return iterationCount;
    }

        public static void main (String[]args) throws Exception {
            Document page = getPage();
            //css query language
            Element tableWth = page.select("table[class=wt]").first();
            System.out.println(tableWth);
            Elements names = tableWth.select("tr[class=wth]");
            Elements values = tableWth.select("tr[valign=top]");

            int index = 0;

            for (Element name : names) {
                String dateSting = name.select("th[id=dt]").text();
                String date = getDateFromString(dateSting);
                System.out.println(date + "\tЯвления\tТемпература \tДавл\tВлажность\tВетер");
                int iterationCount = printPartValues(values, index);
                index = index + iterationCount;


            }

        }
    }

