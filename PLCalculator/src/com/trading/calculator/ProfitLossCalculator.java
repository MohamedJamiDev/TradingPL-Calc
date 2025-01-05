package com.trading.calculator;

public class ProfitLossCalculator {
    public static double calculateProfitOrLoss(double entryPrice, double exitPrice,
                                               int numberOfContracts, FuturesContract contract) {
        double pointDifference = exitPrice - entryPrice;
        return pointDifference * contract.getPointValue() * numberOfContracts;
    }
}
