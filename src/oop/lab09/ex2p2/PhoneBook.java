package oop.lab09.ex2p2;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastName(String lastname);

    Student searchByLastname(String lastname);

    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
