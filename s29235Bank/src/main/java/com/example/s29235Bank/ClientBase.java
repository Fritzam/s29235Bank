package com.example.s29235Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClientBase {

    ArrayList<Client> clientList;

    public ClientBase() {
        this.clientList = new ArrayList<>();
    }

    public ClientBase(ArrayList<Client> objects) {
    }

    public void addClient(int ID, float accountBalance) {
        Client client = checkClientExists(ID);
        if (client == null) {
            if (checkValidBalance(accountBalance)) {
                clientList.add(new Client(ID, accountBalance));
            }
        }
    }

    public Client checkClientExists(int ID) {
        for (Client client: clientList) {
            if (client.getID() == ID) {
                return client;
            }
        }
        return null;
    }

    public boolean checkValidBalance(float amount) {
        return !(amount < 0);
    }

    public void purgeList() {
        clientList.clear();
    }
}
