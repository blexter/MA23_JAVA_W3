import java.util.LinkedHashMap;

public class Inkapsling_Komposition {
    public static void main(String[] args) {

        Inkapsling_Komposition_Job job1 = new Inkapsling_Komposition_Job("Intel", 1000.0);

        Inkapsling_Komposition_Person p1 = new Inkapsling_Komposition_Person("David", job1);

        Inkapsling_Komposition_Person p2 = new Inkapsling_Komposition_Person("Susan", new Inkapsling_Komposition_Job("Apple", 1400.0));

        Double salary = p1.getJob().getSalary();

        System.out.println(salary);

        p1.setName("Per");

        System.out.println("Namn: " + p1.getName());

        p2.getJob().setSalary(1300.0);

        p1.setSalary(1700.0);

        System.out.println(p1);
        System.out.println(p2);
    }
}