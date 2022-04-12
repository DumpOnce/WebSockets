package com.jproject.app.controller;

import com.jproject.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Controller
@RequestMapping("mainPage")
public class MainPageController {


    private final PersonService personService;

    @Autowired
    public MainPageController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String getPage(Model model) throws SQLException, ClassNotFoundException {
        personService.getNumOfAllUsers();
        return "main";
    }
}
