package oop.lab05.ex2p2.service;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        this.name = "";
        this.email = "";
        this.gender = 'm';
    }

    public Author(String name, String email, char gender) {
        super();
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Author[name=" + this.name
                + ",email=" + this.email
                + ",gender=" + this.gender + "]";
    }
}
