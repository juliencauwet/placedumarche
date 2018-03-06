package com.greenwin.placedumarche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemsController {

    @GetMapping("items")
    public String items(){
        return "items";
    }
}
