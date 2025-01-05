package com.trading.calculator;

import java.util.HashMap;
import java.util.Map;

public class ContractManager {

    private final Map<String, FuturesContract> contracts = new HashMap<>();

    public ContractManager() {

        addContract(new FuturesContract("E-mini NASDAQ", 20.0, 100000.0));
        addContract(new FuturesContract("Gold", 100.0, 100.0));
        addContract(new FuturesContract("Crude Oil", 10.0, 1000.0));
        addContract(new FuturesContract("E-mini S&P 500", 50, 125000.0));
        addContract(new FuturesContract("Silver", 5000.0, 25.0));
        addContract(new FuturesContract("Euro FX", 125000.0, 0.0001));
        addContract(new FuturesContract("Corn", 5000.0, 50.0));
        addContract(new FuturesContract("Natural Gas", 10000.0, 100.0));
    }

    public void addContract(FuturesContract contract) {
        contracts.put(contract.getContractName().toLowerCase(), contract);
    }

    public FuturesContract getContractByName(String name) {
        return contracts.get(name.toLowerCase());
    }

    public void listAllContracts() {
        System.out.println("Available Contracts:");
        int index = 1;
        for (FuturesContract contract : contracts.values()) {
            System.out.println(index + ". " + contract.getContractName());
            index++;
        }
    }
}
