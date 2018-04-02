//step 2 of the tutorial -- main class that spring needs to run
package tutorial.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//tell spring that this is where the app starts
@SpringBootApplication
public class CourseApiApp {

    public static void main(String[] args) {
        //this tells spring what to run
        SpringApplication.run(CourseApiApp.class, args);
    }

}
