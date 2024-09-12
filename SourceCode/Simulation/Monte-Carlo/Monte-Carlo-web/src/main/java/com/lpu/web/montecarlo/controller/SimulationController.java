package com.lpu.web.montecarlo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lpu.web.montecarlo.service.MonteCarloSimulationService;

import java.util.List;

@RestController
public class SimulationController {

    @Autowired
    private MonteCarloSimulationService simulationService;

    @GetMapping("/simulate")
    public List<Double[]> simulate(@RequestParam int nTrades, @RequestParam double bidAskSpread, @RequestParam double transactionCost) {
        return simulationService.runSimulation(nTrades, bidAskSpread, transactionCost);
    }
}