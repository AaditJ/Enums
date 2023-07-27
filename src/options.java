import javax.print.attribute.standard.PagesPerMinute;

public enum options{
    ROCK("rock"),
    PAPER("paper"),
    SCISSORS("scissors");

    public String name;

    options(String name) {
        this.name = name;
    }
}
