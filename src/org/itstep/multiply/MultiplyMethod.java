package org.itstep.multiply;

public class MultiplyMethod {

    private static double findMax(double first, double second, double previousResult ){
        double result = first * second;
        if( result > previousResult){
            return result;
        }
        return previousResult;
    }


    public static void main(String[] args) {
        int a=5, b=4;
        long c=4;
        double d=6.0, e=5.5;

        double da = a;
        double db = b;
        double dc = c;
        double result = da * db;
        result = findMax(da, dc, result);
        result = findMax(da , d, result);
        result = findMax(da, e, result);
        result = findMax(db, dc, result );
        result = findMax(db, d, result);
        result = findMax(db, e, result);
        result = findMax(dc, d, result);
        result = findMax(dc, e, result);
        result = findMax(d, e, result);

        System.out.println ( "Max result = " + result);
    }
}
