package pl.sunflux.HRFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan
@RestController
@SpringBootApplication
public class HrFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrFluxApplication.class, args);
    }
}
