package com.greenwin.placedumarche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserProfileController {

    @GetMapping("/userprofile")
    public String displayform(){
        return "userprofile";
    }
}
