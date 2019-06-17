import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "<center><p><font size="3" color="green">Welcome to FreddieMac Spinnaker POC \n by Pricing Devops Team<\p></font></center>\n <center>This is a simple Spring Boot Application</center> \n <center>This is a Successful Response...:)</center>\n";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
