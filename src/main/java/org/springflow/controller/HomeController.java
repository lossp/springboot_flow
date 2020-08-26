package org.springflow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String sayhello() {
        return "ca";
    }
}
