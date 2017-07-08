package mainapplication.controllerClass;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Maincontroller {
@RequestMapping("/")
public String welcome(Model model, @RequestParam(value="name", required=false, defaultValue="sir") String name)
{model.addAttribute("name", name);
return "index";
}
}
