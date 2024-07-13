package prac.sprb.tutorial.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
        private List<Run> runs = new ArrayList<>();

        List<Run> finalAll(){
            return runs;
        }

        Run FindByid(Integer id){
            return runs.stream()
                    .filter(run -> run.id() == id)
                    .findFirst()
                    .get();
        }

        @PostConstruct
        private void init(){
            runs.add(new Run(1,
                    "Monday Morning Run",
                    LocalDateTime.now(),
                    LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                    3,
                    Location.INDOOR));

            runs.add(new Run(2,
                    "WednesDay Evening Run",
                    LocalDateTime.now(),
                    LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                    6,
                    Location.INDOOR));
        }

}
