package org.launchcode.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloSpringController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String helloSpring(@RequestParam String name){
        return "Hello, " + name;
    }

    @GetMapping("{name}")
    public String helloSpringPathParam(@PathVariable String name){
        return "Hello, " + name;
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                    "<form action='hello' method='post'>" +
                    "<input type='text' name='name'>" +
                    "<button type='submit'>Submit</button>" +
                    "</form>" +
                "</body>" +
                "</html>";
    }
}
