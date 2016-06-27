/**
 * Created by raee on 2016. 6. 23..
 */
public enum OWHeroID {
    ALLSTAT("0x02E00000FFFFFFFF"),
    Reaper("0x02E0000000000002"),
    Tracer("0x02E0000000000003"),
    Mercy("0x02E0000000000004"),
    Hanzo("0x02E0000000000005"),
    Torbjörn("0x02E0000000000006"),
    Reinhardt("0x02E0000000000007"),
    Pharah("0x02E0000000000008"),
    Winston("0x02E0000000000009"),
    Widowmaker("0x02E000000000000A"),
    Bastion("0x02E0000000000015"),
    Symmetra("0x02E0000000000016"),
    Zenyatta("0x02E0000000000020"),
    Genji("0x02E0000000000029"),
    McCree("0x02E0000000000042"),
    Junkrat("0x02E0000000000065"),
    Zarya("0x02E0000000000068"),
    Soldier76("0x02E000000000006E"),
    Lúcio("0x02E0000000000079"),
    DVa("0x02E000000000007A");

    final private String id;

    OWHeroID(String id) {
        this.id = id;

    }

    public String getId() {
        return this.id;
    }
}
