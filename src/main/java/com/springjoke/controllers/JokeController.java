package com.springjoke.controllers;

import com.springjoke.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {

    private final QuoteService quoteService;

    public JokeController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
    public String getJoke(Model model) {

        model.addAttribute("joke", quoteService.getQuote());

        return "index";
    }

}
