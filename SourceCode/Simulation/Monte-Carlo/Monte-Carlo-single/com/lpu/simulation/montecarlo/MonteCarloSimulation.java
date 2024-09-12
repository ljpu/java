package com.lpu.simulation.montecarlo;

import java.util.Random;

public class MonteCarloSimulation {

    public static void main(String[] args) {
        // Parameters
        int nGames = 1000000; // Number of games
        int betAmount = 1;    // Amount bet per game
        int payout = 10;      // Payout for a win (including the bet)
        int winningNumber = 10; // Numbers between 1 and 10
        double houseProfit = 0;

        // Random number generator
        Random rand = new Random();

        // Simulate the games
        for (int i = 0; i < nGames; i++) {
            int playerPick = rand.nextInt(winningNumber) + 1;
            int drawnNumber = rand.nextInt(winningNumber) + 1;

            if (playerPick == drawnNumber) {
                houseProfit -= (payout - betAmount); // House pays the player
            } else {
                houseProfit += betAmount; // House keeps the player's bet
            }
        }

        // Calculate the expected profit
        double houseEdge = 1 - (1.0 / winningNumber) * payout;
        double expectedProfit = nGames * betAmount * houseEdge;

        // Output the results
        System.out.println("Simulated Profit for the House: $" + houseProfit);
        System.out.println("Expected Profit for the House: $" + expectedProfit);
    }
}