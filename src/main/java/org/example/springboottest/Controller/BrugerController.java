package org.example.springboottest.Controller;

import org.example.springboottest.Model.Bruger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Bruger());
        return "bruger";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Bruger greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }

}