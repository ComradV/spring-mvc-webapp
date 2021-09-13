package ru.vasiliev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vasiliev.springcourse.dao.ClientDAO;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientDAO clientDAO;

    @GetMapping()
    public String clientsList(Model model){
        model.addAttribute("clients", clientDAO.getClients());
        return "clients/list";
    }
}
