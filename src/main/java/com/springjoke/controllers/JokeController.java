package com.springjoke.controllers;

import com.springjoke.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    @Autowired
    private QuoteService quoteService;

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("joke", quoteService.getQuote());

        return "joke";
    }

}
