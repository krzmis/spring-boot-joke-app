package springbootjokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springbootjokeapp.services.JokeAppService;

@Controller
public class JokeController {

    private JokeAppService jokeAppService;

    @Autowired
    public JokeController(JokeAppService jokeAppService) {
        this.jokeAppService = jokeAppService;
    }

    @RequestMapping({"/", ""})
    public String displayJoke(Model model) {
        model.addAttribute("joke", jokeAppService.getJoke());
        return "chucknorris";
    }

}
