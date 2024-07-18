package prac.sprb.tutorial.run;

import jakarta.annotation.PostConstruct;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Repository
public class RunRepository {
        private static final Logger log = Logger.getLogger(RunRepository.class.getName());
        private final JdbcClient jdbcClient;

        public RunRepository(JdbcClient jdbcClient) {
            this.jdbcClient = jdbcClient;
        }

        public List<Run> findAll(){
            return jdbcClient.sql("select * from run")
                    .query(Run.class)
                    .list();

        }



}
