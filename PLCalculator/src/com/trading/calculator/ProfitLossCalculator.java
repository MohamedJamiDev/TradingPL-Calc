package com.trading.calculator;

public class ProfitLossCalculator {

    public static double calculateProfitOrLoss(double entryPrice, double exitPrice, int numberOfContracts, FuturesContract contract) {

        double pointDifference = exitPrice - entryPrice;

        double profitOrLoss = pointDifference * contract.getPointValue() * numberOfContracts;

        return profitOrLoss;
    }
}
