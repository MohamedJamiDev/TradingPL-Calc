package com.trading.calculator;

import java.util.Scanner;

public class TradingApp {


    public static void main(String[] args) {
        ContractManager contractManager = new ContractManager();
        contractManager.listAllContracts();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the contract you want to trade: ");
        String contractName = scanner.nextLine();

        FuturesContract selectedContract = contractManager.getContractByName(contractName);

        if (selectedContract == null) {
            System.out.println("Invalid contract name. Please try again.");
            return;
        }

        System.out.println("Selected Contract: " + selectedContract.getContractName());
        System.out.println("Point Value: $" + selectedContract.getPointValue());
        System.out.println("Contract Size: " + selectedContract.getContractSize());

        System.out.print("Are you buying or selling? (Enter 'buy' or 'sell'): ");
        String tradeDirection = scanner.nextLine().toLowerCase();

        if (!tradeDirection.equals("buy") && !tradeDirection.equals("sell")) {
            System.out.println("Invalid trade direction. Please enter 'buy' or 'sell'.");
            return;
        }

        System.out.print("Enter entry price: ");
        double entryPrice = scanner.nextDouble();
        System.out.print("Enter exit price: ");
        double exitPrice = scanner.nextDouble();
        System.out.print("Enter number of contracts traded: ");
        int numberOfContracts = scanner.nextInt();

        double profitOrLoss = calculateProfitOrLoss(entryPrice, exitPrice, numberOfContracts, selectedContract, tradeDirection);

        if (profitOrLoss > 0) {
            System.out.println("Profit: $" + profitOrLoss);
        } else if (profitOrLoss < 0) {
            System.out.println("Loss: $" + Math.abs(profitOrLoss));
        } else {
            System.out.println("Break-even (no profit or loss)");
        }

        scanner.close();
    }

    public static double calculateProfitOrLoss(double entryPrice, double exitPrice,
                                               int numberOfContracts, FuturesContract contract, String tradeDirection) {
        double pointDifference;

        if (tradeDirection.equals("buy")) {
            pointDifference = exitPrice - entryPrice;
        } else {
            pointDifference = entryPrice - exitPrice;
        }
        return pointDifference * contract.getPointValue() * numberOfContracts;
    }
}
