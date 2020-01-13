import java.util.Arrays;
import java.util.List;

public class VideoGame {
    private String title, genre, esrbRating, systemsSupported;
    private double cost;

    /**
     * This is the constructor, I created it by right clicking, selecting generate
     * and then constructor
     */
    public VideoGame(String title, String genre, String esrbRating, String systemsSupported, double cost) {
        setTitle(title);
        setGenre(genre);
        setEsrbRating(esrbRating);
        setSystemsSupported(systemsSupported);
        setCost(cost);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty())
            this.title = title;
        else
            throw new IllegalArgumentException("title cannot be empty");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(String esrbRating) {
        List<String> esrbRatings = Arrays.asList("M","E","T");
        if (esrbRating.contains(esrbRating))
            this.esrbRating = esrbRating;
        else
            throw new IllegalArgumentException("ESRB rating must be E, T or M");
    }

    public String getSystemsSupported() {
        return systemsSupported;
    }

    public void setSystemsSupported(String systemsSupported) {
        List<String> supportedSystems = Arrays.asList("PS4","XBox","Nintendo Switch","PC","ALL");
        if (supportedSystems.contains(systemsSupported))
            this.systemsSupported = systemsSupported;
        else
            throw new IllegalArgumentException("System must be in the list "+systemsSupported);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >=0 && cost <= 200)
            this.cost = cost;
        else
            throw new IllegalArgumentException("cost must be 0-200");
    }

    public String toString(){
        return String.format("%s, rated %s has a cost of $%.2f", title,esrbRating, cost);
    }
}
