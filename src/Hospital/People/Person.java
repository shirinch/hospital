package Hospital.People;

public class Person {
    private String name;
    private String secondName;
    private double dateOfBirth;
    private int age;
    private String email;

    public Person(){}
    public Person(String name, String secondName, double dateOfBirth,int age, String email) {
        this.name = name;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        if(age<0){
            System.out.println("возраст введен неправильно");
        }else{
            System.out.println("возраст верный");
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(double dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
