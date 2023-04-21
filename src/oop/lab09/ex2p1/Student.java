package oop.lab09.ex2p1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private String phone;
    private double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = 0.0;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = "";
        this.average = 0.0;
    }

    public Student(String name,
                   String lastname,
                   String phone,
                   double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = 0.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return this.average;
    }

    @Override
    public int compareTo(Student s) {
        if (name.compareTo(s.name) == 0) {
            return lastname.compareTo(s.lastname);
        } else {
            return name.compareTo(s.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, this.average) == 0
                && Objects.equals(this.name, student.name)
                && Objects.equals(this.lastname, student.lastname)
                && Objects.equals(this.phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return "Student[" +
                "name=" + this.name + "\'" +
                ", lastname=" + this.lastname + "\'" +
                ", phone=" + this.phone + "\'" +
                ", average=" + this.average + "]";
    }
}
