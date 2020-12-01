package th.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import th.demo.Controller.HelloWorldController;

@SpringBootApplication(scanBasePackageClasses= HelloWorldController.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
