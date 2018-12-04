package com.pluralsight.iteratorcalcengine;

public class Multiplier extends CalculateBase {
    public Multiplier(){}
    public Multiplier(double gornjiOperand, double donjiOperand){super(gornjiOperand,donjiOperand);}
    public void calculate(){
        double value = getGornjiOperand()*getDonjiOperand();
        setResults(value);
    }
}
