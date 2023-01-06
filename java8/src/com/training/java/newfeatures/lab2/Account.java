package com.training.java.newfeatures.lab2;


public class Account {

    private int          amount;
    private EAccountType accountType;

    public int getAmount() {
        return this.amount;
    }

    public EAccountType getAccountType() {
        return this.accountType;
    }

    public Account setAmount(final int amountParam) {
        this.amount = amountParam;
        return this;
    }

    public Account setAccountType(final EAccountType accountTypeParam) {
        this.accountType = accountTypeParam;
        return this;
    }

    @Override
    public String toString() {
        return "Account [amount=" + this.amount + ", accountType=" + this.accountType + "]";
    }


}
