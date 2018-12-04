package com.pluralsight.iteratorcalcengine;

public class PowerOf implements MathProcessing {
    @Override
    public String getKeyWord() {
        return "power";
    }

    @Override
    public char getSymbol() {
        return '^';
    }

    @Override
    public double doCalculation(double gornjiOperand, double donjiOperand) {
        return Math.pow(gornjiOperand,donjiOperand);
    }
}
