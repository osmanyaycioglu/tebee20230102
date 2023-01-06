package com.training.java.newfeatures.lab1;

import java.time.LocalDate;

public class Person {

    private String    name;
    private String    surname;
    private LocalDate birthdate;
    private String    username;
    private String    password;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public LocalDate getBirthdate() {
        return this.birthdate;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public Person setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public Person setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public Person setBirthdate(final LocalDate birthdateParam) {
        this.birthdate = birthdateParam;
        return this;
    }

    public Person setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }

    public Person setPassword(final String passwordParam) {
        this.password = passwordParam;
        return this;
    }

    @Override
    public String toString() {
        return "Person [name="
               + this.name
               + ", surname="
               + this.surname
               + ", birthdate="
               + this.birthdate
               + ", username="
               + this.username
               + ", password="
               + this.password
               + "]";
    }


}
