import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Welcome to FreddieMac Spinnaker POC \n" +
            "by Pricing Devops Team \n " +
            "This is a simple Spring Boot Application \n" +
            "This is a Successful Response...:)";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
