package prac.sprb.tutorial;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMSG {
    public String getWelcomeMsg() {
        return "Welcome to SPRB tutorial !";
    }
}
