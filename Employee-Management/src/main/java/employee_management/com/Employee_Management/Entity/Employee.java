package employee_management.com.Employee_Management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Entity Class Mapped With Database table 

@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   private String name;
   private  String location;
   private  String company;
   private double salary;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String company) {
        this.company = company;
    }

    public Employee(String company, long id, String location, String name, double salary) {
        this.company = company;
        this.id = id;
        this.location = location;
        this.name = name;
        this.salary = salary;
    }
    public Employee()
    {}

}
