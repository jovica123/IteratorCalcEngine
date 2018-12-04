package com.pluralsight.iteratorcalcengine;

public class Divider extends CalculateBase{
    public Divider(){}
    public Divider(double gornjiOperand, double donjiOperand){
        super(gornjiOperand,donjiOperand);
    }

    public void calculate(){
        double value = getGornjiOperand()/getDonjiOperand();
        setResults(value);
    }
}
