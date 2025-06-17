package sayat.kz.auth_service.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sss")
    public String hello(HttpServletRequest request) {
        return "hello   "+ request.getSession().getId();
    }
}
