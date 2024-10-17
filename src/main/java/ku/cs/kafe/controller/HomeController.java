package ku.cs.kafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getHomepage(Model model) {
        model.addAttribute("greeting", "Sawaddee kaa");
        model.addAttribute("ter", "Iter");
        // return file home.html
        return "home";
    }
}
