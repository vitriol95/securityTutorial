package security.tutorials;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String main(){
        return "Hello Main";
    }

    @RequestMapping("/user")
    public String user(){
        return "Hello User";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Hello Admin";
    }
}
