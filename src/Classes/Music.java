package Classes;

public class Music {
    private String title;
    private String artist;
    private int releaseYear;
    private double sumOfRatings;
    private int totalRatings;

    public void rateMusic(double note) {
        sumOfRatings += note;
        sumOfRatings++;
    }

    public double takeAverage() {
        return sumOfRatings / totalRatings;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }


    public void setTotalRatings(int totalRatings) {
        this.totalRatings = totalRatings;
    }

    public void displayTechnicalSheet() {
        System.out.println(title);
        System.out.println("Artist: " + artist);
        System.out.println("Release year: " + releaseYear);
        System.out.println("Total Ratings: " + totalRatings);
        System.out.println("\n");


    }
}
