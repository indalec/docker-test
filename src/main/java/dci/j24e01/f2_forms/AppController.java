package dci.j24e01.f2_forms;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    }



