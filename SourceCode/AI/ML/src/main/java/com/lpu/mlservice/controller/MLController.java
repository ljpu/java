package com.lpu.mlservice.controller;

import com.lpu.mlservice.service.MLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MLController {

    @Autowired
    private MLService mlService;

    @PostMapping("/predict")
    public boolean predictProfit(@RequestBody double[] tradeResults) {
        return mlService.predictProfit(tradeResults);
    }
}