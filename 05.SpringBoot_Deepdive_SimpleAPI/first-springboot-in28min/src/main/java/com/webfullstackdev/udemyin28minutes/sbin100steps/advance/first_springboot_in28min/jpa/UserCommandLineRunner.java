package com.webfullstackdev.udemyin28minutes.sbin100steps.advance.first_springboot_in28min.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

    @Autowired
    UserRepository repository;
    @Override
    public void run(String... args )throws Exception {
        //
        System.out.println("USERCOMMANDLINERUNNER");
        repository.save(new User("ganapath", "gn"));
        repository.save(new User("ganapath", "spring"));
        repository.save(new User("ganapath", "sbp"));

        for (User user : repository.findAll()) {
            log.info(user.toString());
        }
        log.info("--------------------------------");
        log.info("role as gn");
        for(User user: repository.findByRole("gn")){
            log.info(user.toString());
        }
    }
}
