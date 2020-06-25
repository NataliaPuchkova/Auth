package alfa.house.auth.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@PreAuthorize("isAuthenticated()")
@Controller
public class OAuth2LoginController {

        @RequestMapping("/")
        @PreAuthorize("permitAll()")
        @ResponseBody
        public String home() {
            return "Welcome home!";
        }
        @PreAuthorize("isAuthenticated()")
        @RequestMapping("/restricted")
        @ResponseBody
        public String restricted() {
            return "You found the secret lair!";
        }

}
