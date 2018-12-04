package com.pluralsight.iteratorcalcengine;

public class DynamicHelper {
    private MathProcessing[] handlers;
    public DynamicHelper(MathProcessing[] handlers){
        this.handlers = handlers;
    }

    public String process(String statement){  // copy value of statement

        String[] parts =statement.split(MathProcessing.SEPARATOR);
        String keyword = parts[0]; // add

        MathProcessing theHandler = null;

        for(MathProcessing handler:handlers){
            if(keyword.equalsIgnoreCase(handler.getKeyWord())){
                theHandler = handler;
                break;
            }
        }
        double gornjiOperand = Double.parseDouble(parts[1]);
        double donjiOperand = Double.parseDouble(parts[2]);

        double rezultat = theHandler.doCalculation(gornjiOperand,donjiOperand);
        StringBuilder sb = new StringBuilder(20);

        sb.append(gornjiOperand);
        sb.append(' ');
        sb.append(theHandler.getSymbol());
        sb.append(' ');
        sb.append(donjiOperand);
        sb.append(" = ");
        sb.append(rezultat);

        return sb.toString();
    }
}
