package com.trading.calculator;

public class FuturesContract {

    private String contractName;
    private double pointValue;
    private double contractSize;

    public FuturesContract(String contractName, double pointValue, double contractSize) {
        this.contractName = contractName;
        this.pointValue = pointValue;
        this.contractSize = contractSize;
    }

    public String getContractName() {
        return contractName;
    }

    public double getPointValue() {
        return pointValue;
    }

    public double getContractSize() {
        return contractSize;
    }

    @Override
    public String toString() {
        return "FuturesContract{" +
                "contractName='" + contractName + '\'' +
                ", pointValue=" + pointValue +
                ", contractSize=" + contractSize +
                '}';
    }
}
