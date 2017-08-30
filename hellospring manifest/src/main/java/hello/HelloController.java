package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/*
Ready to use by SpingMVC to handle Web Requests, 
this combines Controller and ResponseBody resulting in web requests returning data rather
than a view 
*/

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hi! Greetings from Shubha :)";
    }

}