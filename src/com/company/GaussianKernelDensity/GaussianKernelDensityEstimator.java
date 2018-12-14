package com.company.GaussianKernelDensity;

public class GaussianKernelDensityEstimator {

    private static double[] dist = {5.11, 4.79, 4.90, 4.74, 2.96, 5.16, 2.88};

    private static double M = 7;
    private static double variance = 1;
    private static double N = dist.length;

    public static void main(String[] args) {

        double sum = 0;

        for (double dist : dist) {
            sum += calc(dist);
        }

        double res = (sum * (1 / (Math.pow(2 * Math.PI, M / 2) * Math.sqrt(Math.pow(variance, M * 2))))) / N;

        System.out.println(res);
    }

    private static double calc(double val) {
        return Math.exp(-(Math.pow(val, 2) / 2));
    }

}