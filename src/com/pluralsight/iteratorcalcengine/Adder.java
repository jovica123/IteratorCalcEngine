package com.pluralsight.iteratorcalcengine;

public class Adder extends CalculateBase implements MathProcessing {
    public Adder(){}
    public Adder(double gornjiOperand, double donjiOperand){ super(gornjiOperand,donjiOperand);}

    @Override
    public void calculate(){
        double value = getGornjiOperand()+getDonjiOperand();
        setResults(value);
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double gornjiOperand, double donjiOperand) {
        setGornjiOperand(gornjiOperand);
        setDonjiOperand(donjiOperand);
        calculate();
        return getResults();
    }
}
