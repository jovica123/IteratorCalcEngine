package com.pluralsight.iteratorcalcengine;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyWord(); // add
    char getSymbol();    // +
    double doCalculation(double gornjiOperand, double donjiOperand);
}
