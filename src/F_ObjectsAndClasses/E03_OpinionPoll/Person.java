package F_ObjectsAndClasses.E03_OpinionPoll;

public class Person {

    // Characterization
    private String name;
    private int age;

    // Methods

    public void printPerson() {
        System.out.printf("%s - %d%n", this.name, this.age);
    }

    // Constructor

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
