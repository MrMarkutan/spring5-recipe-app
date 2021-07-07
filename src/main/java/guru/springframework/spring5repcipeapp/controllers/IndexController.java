package guru.springframework.spring5repcipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    private String getIndexPage(){
        System.out.println("Some message to say... 55555555");
        return "index";
    }
}
