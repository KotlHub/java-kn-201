package step.learning.IOC;

import step.learning.IOC.services.hash.HashService;

import javax.inject.Inject;

public class IocDemo {
    @Inject
    private HashService hashService;

    public void run() {
        System.out.println("IOC DEMO RUN");
        System.out.println(hashService.hash("IocDemo"));
    }
}

// IOC - invertion of control (инверсия управления)
