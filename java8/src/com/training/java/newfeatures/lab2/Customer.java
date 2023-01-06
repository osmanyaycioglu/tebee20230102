package com.training.java.newfeatures.lab2;

import java.time.LocalDateTime;
import java.util.List;

public class Customer {

    private String        name;
    private String        surname;
    private Integer       height;
    private String        username;
    private String        password;
    private boolean       activated;
    private LocalDateTime activatedDate;
    private List<Account> accounts;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getHeight() {
        return this.height;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isActivated() {
        return this.activated;
    }

    public LocalDateTime getActivatedDate() {
        return this.activatedDate;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public Customer setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public Customer setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public Customer setHeight(final Integer heightParam) {
        this.height = heightParam;
        return this;
    }

    public Customer setUsername(final String usernameParam) {
        this.username = usernameParam;
        return this;
    }

    public Customer setPassword(final String passwordParam) {
        this.password = passwordParam;
        return this;
    }

    public Customer setActivated(final boolean activatedParam) {
        this.activated = activatedParam;
        return this;
    }

    public Customer setActivatedDate(final LocalDateTime activatedDateParam) {
        this.activatedDate = activatedDateParam;
        return this;
    }

    public Customer setAccounts(final List<Account> accountsParam) {
        this.accounts = accountsParam;
        return this;
    }

    @Override
    public String toString() {
        return "Customer [name="
               + this.name
               + ", surname="
               + this.surname
               + ", height="
               + this.height
               + ", username="
               + this.username
               + ", password="
               + this.password
               + ", activated="
               + this.activated
               + ", activatedDate="
               + this.activatedDate
               + ", accounts="
               + this.accounts
               + "]";
    }


}
