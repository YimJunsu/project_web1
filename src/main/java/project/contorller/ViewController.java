package project.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("")
    public String index(){return "index.html";}

    @GetMapping("/member/login.html")
    public String login(){return "/member/login.html";}

    @GetMapping("/member/signup.html")
    public String signup(){return  "/member/signup.html";}
}
