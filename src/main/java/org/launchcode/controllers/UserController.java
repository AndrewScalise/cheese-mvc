package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("")
public class UserController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("title", "Register");
        return "user/add";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify) {

        model.addAttribute("user", user);
        boolean passwordsMatch = true;
        if (user.getPassword() == null || verify == null
                || !user.getPassword().equals(verify)) {
            passwordsMatch = false;
            model.addAttribute("verifyError", "Passwords must match");
        }

        if (passwordsMatch) {
            return "user/index";
        }
        model.addAttribute("title", "Register");
        return "user/add";

    }


}
