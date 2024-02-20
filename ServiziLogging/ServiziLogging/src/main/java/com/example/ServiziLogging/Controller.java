package com.example.ServiziLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Controller {
    Logger logger = LoggerFactory.getLogger(Controller.class);
    @Value("${custom.env.var1}")
    private double var1;
    @Value("${custom.env.var2}")
    private double var2;
    @Autowired
    private PowerService powerService;

    @GetMapping("/")
    public String getWelcome() {
        logger.info("welcome message");
        return "Welcome!";
    }

    @GetMapping("/exp")
    public double powerOfEnvVar() {
        return powerService.calculatingPower(var1, var2);
    }

    @GetMapping("/get-errors")
    public void getError() {
        logger.error("error");
        throw new CustomError("an error occurred");
    }
}
