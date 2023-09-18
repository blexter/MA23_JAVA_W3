public class Inkapsling_Komposition_Person {
    private String name;
    private Inkapsling_Komposition_Job job;

    public Inkapsling_Komposition_Person(String name, Inkapsling_Komposition_Job job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inkapsling_Komposition_Job getJob() {
        return job;
    }

    public void setJob(Inkapsling_Komposition_Job job) {
        this.job = job;
    }

    public void setSalary(double salary){
        this.job.setSalary(salary);
    }

    public String toString() {
        return "name: " + name + " company: " + job.getCompany() + " salary: " + job.getSalary();
    }
}
