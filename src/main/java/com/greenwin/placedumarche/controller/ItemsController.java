package com.greenwin.placedumarche.controller;

import com.greenwin.placedumarche.entities.Item;
import com.greenwin.placedumarche.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemsController {

    @Autowired
    ItemService itemService;

    @GetMapping("/items")
    public String items(){
        return "items";
    }

    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public void addItem(@RequestParam("name") String name, @RequestParam("price") float price, @RequestParam("desc") String description){
        Item item = new Item();
        item.setName(name);
        item.setPrice(price);
        item.setDescription(description);

        itemService.addItem(item);
    }
}
