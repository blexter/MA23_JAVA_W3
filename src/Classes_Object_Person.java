public class Classes_Object_Person {
    String name;
    String phoneNumber;
    int age;

    public Classes_Object_Person() {
        this.name = "--";
        this.phoneNumber = "--";
        this.age = 0;
    }
    public Classes_Object_Person(String name, String phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hej jag heter " + name);
    }

    public String toString() {
        return "Name: " + this.name +
        " Phone: " + this.phoneNumber +
        " Age: " + this.age;
    }
}
