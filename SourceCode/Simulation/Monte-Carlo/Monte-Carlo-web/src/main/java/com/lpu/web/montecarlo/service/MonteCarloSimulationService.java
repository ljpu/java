// package com.example.simulationservice.service;
package com.lpu.web.montecarlo.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MonteCarloSimulationService {

    public List<Double[]> runSimulation(int nTrades, double bidAskSpread, double transactionCost) {
        double marketMakerProfit = 0;
        double individualInvestorProfit = 0;

        List<Double[]> results = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < nTrades; i++) {
            marketMakerProfit += bidAskSpread;
            boolean profitTrade = rand.nextDouble() < 0.45;
            if (profitTrade) {
                individualInvestorProfit += (bidAskSpread - transactionCost);
            } else {
                individualInvestorProfit -= (bidAskSpread + transactionCost);
            }
            results.add(new Double[]{marketMakerProfit, individualInvestorProfit});
        }
        return results;
    }
}