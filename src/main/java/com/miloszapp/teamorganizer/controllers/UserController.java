package com.miloszapp.teamorganizer.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;

@Controller
@Secured("ROLE_USER")
public class UserController {
}
