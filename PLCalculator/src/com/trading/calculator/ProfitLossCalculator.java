package com.trading.calculator;

public class ProfitLossCalculator {

    public static double calculateProfitOrLoss(double entryPrice, double exitPrice, int numberOfContracts, FuturesContract contract) {
        // Calculate the point difference
        double pointDifference = exitPrice - entryPrice;

        // Calculate profit or loss
        double profitOrLoss = pointDifference * contract.getPointValue() * numberOfContracts;

        return profitOrLoss; // Return the result
    }
}
