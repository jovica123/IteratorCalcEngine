package com.pluralsight.myapp;

import com.pluralsight.iteratorcalcengine.Adder;
import com.pluralsight.iteratorcalcengine.DynamicHelper;
import com.pluralsight.iteratorcalcengine.MathProcessing;
import com.pluralsight.iteratorcalcengine.PowerOf;

public class Main {

    public static void main(String[] args) {

        String[] statements = {   // original value of statement
                "add 25.0 92.0",   // 25.0+92.0=117.0
                "power 5.0 2.0"    // 5.0 ^ 2.0 = 25.0  5 na kvadrat
        };
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{
                new Adder(),
                new PowerOf()
        });
        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }
    }

            }


