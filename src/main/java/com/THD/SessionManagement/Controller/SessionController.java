package com.THD.SessionManagement.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by axb4725 on 5/18/17.
 */
@RestController
public class SessionController {
    @RequestMapping("/")
    public String helloAdmin() {


        return "hello admin";
    }
}
