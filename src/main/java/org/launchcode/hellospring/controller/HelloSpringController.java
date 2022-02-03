package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloSpringController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    public String helloSpring(@RequestParam String name, @RequestParam String lang){
        String greeting = lang.equals("en") ? "Hello" : lang.equals("fr") ? "Bonjour" : lang.equals("es") ? "Hola" : lang.equals("ita") ? "Buongiorno" : lang.equals("ger") ? "Guten tag" : "Hello";
        return greeting + ", " +  name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                    "<form action='hello' method='get'>" +
                        "<input type='text' name='name'>" +
                            "<select name='lang'>" +
                                "<option value='en'>English</option>" +
                                "<option value='fr'>Français</option>" +
                                "<option value='es'>Español</option>" +
                                "<option value='ita'>Italiano</option>" +
                                "<option value='ger'>Deutsch</option>" +
                            "</select>" +
                        "<button type='submit'>Submit</button>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }

}
