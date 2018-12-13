package com.company;

public class density {

    private static double[] dist = {4.39,3.62,4.53,3.83,4.36,4.14,4.06, 4.31};

    public static double M = 6;
    private static double variance =1;
    private static double N = 8;

    public static void main(String[] args) {

        double sum = 0;

        for (double dist: dist) {
            sum += calc(dist);
        }

        double res = (sum*(1/(Math.pow(2*Math.PI,M/2)*Math.sqrt(Math.pow(variance, M*2)))))/N;

        System.out.println(res);
    }

    public static double calc(double val){
        return Math.exp(-(Math.pow(val, 2)/2));
    }
}
