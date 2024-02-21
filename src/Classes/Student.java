package Classes;

public class Student {
    private String name;
    private String birthDate;
    private String adress;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void displayInformation() {
        System.out.println("Student name: " + name);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Adress: " + adress);
    }
}
