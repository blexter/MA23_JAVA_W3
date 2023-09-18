import java.time.Period;
import java.util.ArrayList;

public class Classes_Object {
    public static void main(String[] args) {
        Classes_Object_Person p1 = new Classes_Object_Person("David", "1234", 44);
        Classes_Object_Person p2 = new Classes_Object_Person("Lois", "1234", 30);

        Classes_Object_Person p3 = p1;

        System.out.println(p3.name);
        p1.name = "Susan";

        System.out.println(p1.name);
        System.out.println(p3.name);

        Classes_Object_Person p4 = new Classes_Object_Person();
        System.out.println(p4.name);

        p1.greet();
        p4.greet();

        ArrayList<Classes_Object_Person> persons = new ArrayList<>();

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        for(Classes_Object_Person person : persons){
            System.out.println(person.name);
            person.greet();
            System.out.println(person);
        }

    }
}