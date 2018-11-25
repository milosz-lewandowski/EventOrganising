package com.miloszapp.teamorganizer.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Secured("ROLE_ADMIN")
public class AdminController {

    @RequestMapping("/adminshere")
    protected String adminshere(){
        return "/templates/welcomeadmin";
    }

    @RequestMapping("/orderspanel")
    protected String orderspanel(){
        return "/templates/orderspanel";
    }

}
