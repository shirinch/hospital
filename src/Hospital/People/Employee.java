package Hospital.People;

public class Employee extends Person {
    private String job;

    public Employee(){}
    public Employee(String name, String secondName, double dateOfBirth,int age , String email, String job) {
        super(name, secondName, dateOfBirth, age, email);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
