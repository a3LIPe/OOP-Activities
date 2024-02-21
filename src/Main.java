import Classes.Car;
import Classes.Music;
import Classes.Person;
import Classes.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.setModel("Model 3");
    car.setBrand("Tesla");
    car.setColor("Red");
    car.setReleaseYear(2017);
    car.displayTechnicalSheet();

    Music music = new Music();
    music.setTitle("Êxodo");
    music.setReleaseYear(2019);
    music.setArtist("Guilherme Andrade & Guilherme Iamarino");
    music.displayTechnicalSheet();

    Person person = new Person();
    person.setName("Alex");
    person.setAge(34);
    person.setHeight(175);
    person.setHeight(84);
    person.displaySalutation();

    Student student = new Student();
    student.setName("Roger");
    student.setBirthDate("01/24/2008");
    student.setAdress("example street, number x");
    student.displayInformation();
    }
}