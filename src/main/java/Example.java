import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "<html><center><font face='arial' size='10' color='#8ebf42'>Welcome to FreddieMac Spinnaker POC <br> by Pricing Devops Team <br> </font> <font face='verdana' color='black'>This is a simple Spring Boot Application <br> Successful Response...:)</font></center></html>";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
