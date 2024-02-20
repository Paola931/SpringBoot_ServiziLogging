package com.example.ServiziLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PowerService {
    Logger logger = LoggerFactory.getLogger(PowerService.class);
    public double calculatingPower(double var1, double var2){
        logger.info("calculating process started");
        double result =  Math.pow(var1,var2);
        logger.info("calculating process ended");
        return result;
    }
}
