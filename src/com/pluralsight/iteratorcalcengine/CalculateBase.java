package com.pluralsight.iteratorcalcengine;

public abstract class CalculateBase {
    private double gornjiOperand;
    private double donjiOperand;
    private double results;
    public double getGornjiOperand(){return gornjiOperand;}
    public void setGornjiOperand(double gornjiOperand){this.gornjiOperand = gornjiOperand;}
    public double getDonjiOperand(){return donjiOperand;}
    public void setDonjiOperand(double donjiOperand){this.donjiOperand=donjiOperand;}
    public double getResults(){return results;}
    public void setResults(double results){this.results = results;}

    public CalculateBase(){}
    public CalculateBase(double gornjiOperand, double donjiOperand){
        this.gornjiOperand = gornjiOperand;
        this.donjiOperand = donjiOperand;
    }
    public abstract void calculate();
}
