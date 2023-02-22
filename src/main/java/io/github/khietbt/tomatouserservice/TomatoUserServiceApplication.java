package io.github.khietbt.tomatouserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TomatoUserServiceApplication {
    @GetMapping("/test")
    private ResponseEntity<?> test() {
        return ResponseEntity.ok("test");
    }

    public static void main(String[] args) {
        SpringApplication.run(TomatoUserServiceApplication.class, args);
    }
}