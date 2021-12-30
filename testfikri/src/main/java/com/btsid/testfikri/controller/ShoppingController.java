package com.btsid.testfikri.controller;

import com.btsid.testfikri.model.Shopping;
import com.btsid.testfikri.services.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ShoppingController {
    private ShoppingService shoppingService;
    @Autowired
    public void setShoppingService(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @RequestMapping ("/shopping")
    public String Shoppinglist(Model model){
        model.addAttribute("shopping",shoppingService.listShopping() );
        return "shopping";
    }
    @RequestMapping(value = "/shopping/create", method = RequestMethod.GET)
    public String tampilkanForm(Model model){
        model.addAttribute("shopping", new Shopping());
        return "formShopping";

    }
    @RequestMapping(value = "/shopping/create", method = RequestMethod.POST)
    public String simpanDataShopping(Model model, Shopping shopping){
        model.addAttribute("shopping",shoppingService.saveOrUpdate(shopping));
        return "redirect:/shopping";
    }
    @RequestMapping(value = "/shopping/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id, Model model){
        model.addAttribute("shopping",shoppingService.getIdShopping(id));
        return "formShopping";
    }
    @RequestMapping(value = "/shopping/hapus/{id}")
    public String hapus(@PathVariable Integer id){
        shoppingService.hapus(id);
        return "redirect:/shopping";
    }
}
