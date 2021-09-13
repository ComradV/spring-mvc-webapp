package ru.vasiliev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.vasiliev.springcourse.models.Client;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientDAO {
    private List<Client> clients;
    private int COUNTER = 0;
    {
        clients = new ArrayList<>();
        clients.add(new Client(++COUNTER, "Vera", "Alimova"));
        clients.add(new Client(++COUNTER,"Anna", "Petrova"));
        clients.add(new Client(++COUNTER,"Pavel", "Makarov"));
    }

    public List<Client> getClients(){
        return clients;
    }
}
