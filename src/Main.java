import com.sun.deploy.net.URLEncoder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        MOStats stat = new MOStats("케이크류#3111");
        System.out.println(stat.getBattleTag());
        System.out.println(stat.getTotalGames());
//        System.out.println(stat.getWin());
//        System.out.println(stat.getLoss());
        System.out.println(stat.getWinrate() * 100);
        System.out.println(stat.getHeros().size());




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
