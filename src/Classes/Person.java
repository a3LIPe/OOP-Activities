package Classes;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public void displaySalutation() {
        System.out.println("Hello World!");
        System.out.println("\n");
    }
}
