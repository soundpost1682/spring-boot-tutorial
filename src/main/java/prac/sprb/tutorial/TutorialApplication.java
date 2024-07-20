package prac.sprb.tutorial;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import prac.sprb.tutorial.run.Location;
import prac.sprb.tutorial.run.Run;
import prac.sprb.tutorial.run.RunRepository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class TutorialApplication {

    private static final Logger log = LoggerFactory.getLogger(TutorialApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TutorialApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(RunRepository runRepository){
        return args -> {
            Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
            System.out.println(run.location());
            runRepository.create(run);
        };


    }
}


