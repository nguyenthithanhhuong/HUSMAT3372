package oop.lab05.ex1p4.service;

public class Employee {
    private int id = 0;
    private String firstName = "";
    private String lastName = "";
    private int salary = 0;

    public Employee() {
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
    }
    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return this.firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return this.id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAnnualSalary() {
        return 12*this.salary;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary*percent;
        return this.salary;
    }

    public String toString() {
        return "Employee[id=" + this.id
                + ",name=" + this.firstName + " " + this.lastName
                + ",salary=" + this.salary + "]";
    }
}
