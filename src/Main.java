import com.sun.deploy.net.URLEncoder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        String encodeString = URLEncoder.encode("케이크류", "UTF-8");
        Document doc = Jsoup.connect("http://masteroverwatch.com/profile/pc/kr/" + encodeString + "-3111").userAgent("Mozilla").get();

//        System.out.println(doc);

        Elements overViewStats = doc.select("body > main.player-header div.header-stats div.header-stat");

        for (Element ele : overViewStats) {
            System.out.println(ele.select("span").text());
            System.out.println(ele.select("strong").text());
        }

        Elements heroList = doc.select("body div.heroes-list div.heroes-row-container");

        for (Element ele : heroList) {
            System.out.println(ele.select("div.heroes-icon > strong > span").text());
            System.out.println(ele.select("div.heroes-icon > strong > div > strong").text());

            System.out.println(ele.select("div.heroes-stats > div.heroes-stats-kda > strong").text());

            System.out.println(ele.select("div.heroes-winrate > strong").text());
            System.out.println(ele.select("div.heroes-winrate > span").text());
//            System.out.println(ele.select("strong").text());
        }



























//        Document doc = Jsoup.connect("https://playoverwatch.com/en-us/career/pc/kr/" + encodeString + "-3111").timeout(0).get();


//        Elements overview = doc.select("#highlights-section > div > ul > li > div > div");
//
//        System.out.println(overview.size());
////        for (Element ele : overview) {
////            System.out.println("-------------------");
////            System.out.println(ele.select("p").text());
////            System.out.println(ele.select("h3").text());
////        }
//
//        // #stats-section > div > div.row > div.js-stats.toggle-display.is-active
//        // #stats-section > div > div.row > div:nth-child(2)
////        Elements stats = doc.select("#stats-section > div > div.row > div");
//        for (OWHero owHero : OWHero.values()) {
//            String selector = "div[data-category-id=" + owHero.getId() + "] table tbody tr";
//            Elements stats = doc.select(selector);
//            System.out.println("\n=================");
//            System.out.println(owHero.toString());
//            for (Element ele : stats) {
//                System.out.println("---------------------------");
//                System.out.println(ele.children().get(0).text());
//                System.out.println(ele.children().get(1).text());
////            System.out.println("String " + ele.text() + "Id = \"" + ele.attr("value") + "\";");
//            }
//        }
//
//
////        Elements stats = doc.select("#stats-section > div option");
//
////        System.out.println(stats);
////        Elements m = stats.select("div[data-category-id='0x02E0000000000002'");
////        System.out.println(m.toString());

    }
}
