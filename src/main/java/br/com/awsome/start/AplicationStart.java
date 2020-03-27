package br.com.awsome.start;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.awsome.endpoint")
public class AplicationStart implements CommandLineRunner {
    public static void main(String[] args) {

        SpringApplication.run(AplicationStart.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
