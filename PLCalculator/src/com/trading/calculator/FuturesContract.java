package com.trading.calculator;

public class FuturesContract {

    private String contractName;  // Field names start with lowercase
    private double pointValue;
    private double contractSize;

    // Constructor to initialize the contract
    public FuturesContract(String contractName, double pointValue, double contractSize) {
        this.contractName = contractName;
        this.pointValue = pointValue;
        this.contractSize = contractSize;
    }

    // Getter methods
    public String getContractName() {
        return contractName;
    }

    public double getPointValue() {
        return pointValue;
    }

    public double getContractSize() {
        return contractSize;
    }

    // Optional: Override toString for better debugging
    @Override
    public String toString() {
        return "FuturesContract{" +
                "contractName='" + contractName + '\'' +
                ", pointValue=" + pointValue +
                ", contractSize=" + contractSize +
                '}';
    }
}
