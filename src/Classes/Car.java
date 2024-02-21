package Classes;

public class Car {
    private String model;
    private String brand;

    private int releaseYear;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayTechnicalSheet() {
        System.out.println("name: " + model);
        System.out.println("brand: " + brand);
        System.out.println("Year: " + releaseYear);
        System.out.println("Color: " + color);
        System.out.println("\n");
    }

    public int calculateYear(int currentYear) {
        return currentYear = releaseYear;
    }
}
