package com.example.s29235Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Service {

    ClientBase clientBase;

    public Service() {
        this.clientBase = new ClientBase(new ArrayList<>());
    }

    public Client transferFromClient(int ID, float amount) {
        Client client = clientBase.checkClientExists(ID);
        if (client != null) {
            float currentBalance = client.getAccountBalance() - amount;
        }
        return null;

    }

    public Client transferToClient(int ID, float amount) {
        Client client = clientBase.checkClientExists(ID);
        if (client != null) {
            float currentBalance = client.getAccountBalance();
            client.setAccountBalance(currentBalance + amount);
        }
        return client;
    }


    public String clientInfo(int ID) {
        Client client = clientBase.checkClientExists(ID);
        if (client != null) {
            return "Client id is: " + client.getID() + "\nClient accout balance: " + client.getAccountBalance();
        }
        return null;
    }

}
