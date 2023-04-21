package oop.lab09.ex2p2;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    private ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook) {
            if (student != null && student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook) {
            if (student != null && student.getName().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student != null && student.getName().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Student student : phoneBook) {
            if (student.getPhone().equals(phone)) {
                phoneBook.remove(student);
            }
        }
    }
}
