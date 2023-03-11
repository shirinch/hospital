package Hospital.People;

public class Patient extends Person {
    private String diagnoz;


    public Patient(){}
    public Patient(String name, String secondName, double dateOfBirth,int age, String email, String diagnoz) {
        super(name, secondName, dateOfBirth,age, email);
        this.diagnoz = diagnoz;
    }

    public String getDiagnoz() {
        return diagnoz;
    }

    public void setDiagnoz(String diagnoz) {
        this.diagnoz = diagnoz;
    }
}
