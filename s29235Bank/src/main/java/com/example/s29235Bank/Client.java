package com.example.s29235Bank;

import java.util.ArrayList;

public class Client {

    private int ID;
    private float accountBalance;

    public Client(int ID, float accountBalance) {
        this.ID = ID;
        this.accountBalance = accountBalance;
    }

    public int getID() {
        return this.ID;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float amount) {
        accountBalance = amount;
    }
}
