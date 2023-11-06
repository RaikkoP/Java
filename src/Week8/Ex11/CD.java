package Week8.Ex11;

public class CD implements ToBeStored{
    private String artist;
    private String title;
    private int year;
    private double weight = 0.1;

    public CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.year = year;
    }
    @Override
    public double weight() {
        return weight;
    }
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.year + ")";
    }

}
