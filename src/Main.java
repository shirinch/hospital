import Hospital.Building;
import Hospital.People.Employee;
import Hospital.People.Patient;
import Hospital.People.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Lily", "Jones",10.1997,26,"LilyJ@gmail.com");
        Person person2 = new Person("Mark","Louis",3.1999,24,"LouisMark9@gmail.com");
        Person person3 = new Person("Charlie", "May",12.1983,40,"May9@gmail.com");
        Employee employee1 = new Employee("Dane","Michaels",11.1987,33,
                "DaneM@gmail.com","Main Doctor");
        Employee employee2 = new Employee("Lucy","Forks",2.1977,43,
                "LucyF77@gamil.com","Nurse");
        Patient patient1 = new Patient("Kimberly","South",5.1998,25,
                "KimKIm@gmail.com","Broken leg");
        Patient patient2 = new Patient("Taylor","Beat",2.1999,24,
                "Taylorrr@gmail.com","sunstroke");
        Patient patient3 = new Patient("John","Polson",3.1996,27,
                "Polson@gmail.com","broken arm");
        Building bolnica = new Building(3,123,"Royal street, 33");
    }

}