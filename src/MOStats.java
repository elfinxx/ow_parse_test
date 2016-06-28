import com.sun.deploy.net.URLEncoder;
import lombok.Data;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bart on 6/23/16. thx.
 */

@Data
public class MOStats {
    private final String MOUrl = "http://masteroverwatch.com/profile/pc/kr/";
    private String battleTag;
    private int totalGames;
    private int win;
    private int loss;
    private List<OWHero> heros;

    public MOStats(String bt) throws IOException {
        String battleTag = bt.replace("#", "-");
        String encodeString = URLEncoder.encode(battleTag, "UTF-8");
        Document doc = Jsoup.connect(MOUrl + encodeString).userAgent("Mozilla").get();

        Elements overViewStats = doc.select("body > main.player-header div.header-stats div.header-stat");
        for (Element ele : overViewStats) {
            if (ele.select("span").text().equals("Total Games")) {
                totalGames = Integer.parseInt(ele.select("strong").text());
            } else if (ele.select("span").text().equals("Win/Loss")) {
                String[] winloass = ele.select("strong").text().split("/");
                win = Integer.parseInt(winloass[0]);
                loss = Integer.parseInt(winloass[1]);
            }
        }

        Elements heroList = doc.select("body div.heroes-list div.heroes-row-container");
        heros = new ArrayList<>();
        for (Element ele : heroList) {
            OWHero aHero = new OWHero();
            aHero.setName(ele.select("div.heroes-icon > strong > span").text());
            aHero.setRank(ele.select("div.heroes-icon > strong > div > strong").text());
            aHero.setKDRate(Double.parseDouble(ele.select("div.heroes-stats > div.heroes-stats-kda > strong").text()));
            aHero.setWinRate(ele.select("div.heroes-winrate > strong").text());
            aHero.setGames(Integer.parseInt(ele.select("div.heroes-winrate > span").text().split(" ")[0]));
            heros.add(aHero);
        }

        this.battleTag = bt;
    }

    public double getWinrate() {
        return (double)win / (win + loss);
    }

    public String getBattleTag() {
        return battleTag;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public int getWin() {
        return win;
    }

    public int getLoss() {
        return loss;
    }

    public List<OWHero> getHeros() {
        return heros;
    }
}
