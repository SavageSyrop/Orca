package own.savage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "own.savage")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
