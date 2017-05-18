package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mugen on 5/18/2017.
 */

@Controller
@RequestMapping("cheese")
public class CheeseController {

    // Request path: /cheese
    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }
}
