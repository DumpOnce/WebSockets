package com.jproject.app.controller;

import com.jproject.app.entities.Person;
import com.jproject.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;
import org.slf4j.*;


@Controller
@RequestMapping("database1")
public class LogicController {

     private final PersonService personService;
     private int f = 0;

    @Autowired
    public LogicController(PersonService personService) {
        this.personService = personService;
    }

    @MessageMapping("/global")
    @SendTo("/topic/sending")
    public String getPeople( @Payload String person){
        f++;
        return  "vsggr"+f;
    }

    @GetMapping
    public String putElement(Model model){
        model.addAttribute("number","str"+f);
        return "login";
    }

}
