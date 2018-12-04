package com.pluralsight.iteratorcalcengine;

public class Subtracter extends CalculateBase {
    public Subtracter(){}
    public Subtracter(double gornjiOperand, double donjiOperand){super(gornjiOperand,donjiOperand);}

    @Override
    public void calculate(){
        double value = getGornjiOperand()-getDonjiOperand();
        setResults(value);
    }
}
