//step 3 -- example rest controler --this does not have anything to do with the actual app
package tutorial.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//the rest controller maps methods to urls
@RestController
public class HelloController {

    @RequestMapping("/hello")//the GET method is deafault
    public String sayHi(){
        return "Hi";
    }



}
