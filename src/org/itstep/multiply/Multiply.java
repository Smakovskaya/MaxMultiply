package org.itstep.multiply;

import java.sql.SQLOutput;

public class Multiply {

    public static void main(String[] args) {
        int a=5, b=4;
        long c=4;
        double d=6.0, e=5.5;

        double da = a;
        double db = b;
        double dc = c;

        double result = da * db;
        double newResult = da * dc;
        if( newResult > result){
            result = newResult;
        }
        newResult = da * d;
        if (newResult > result){
           result = newResult;
        }

        newResult = da * e;
        if (newResult > result){
            result = newResult;
        }

        newResult = db * c;
        if (newResult > result){
            result = newResult;
        }

        newResult = db * d;
        if (newResult > result){
            result = newResult;
        }

        newResult = db * e;
        if (newResult > result){
            result = newResult;
        }

        newResult = c * d;
        if (newResult > result){
            result = newResult;
        }

        newResult = c * e;
        if (newResult > result){
            result = newResult;
        }

        newResult = d * e;
        if (newResult > result){
            result = newResult;
        }

        System.out.println ( "Max result = " + result);

    }
}
