package com.company.ConfusionMatrix;

public class Main {

    public static void main(String[] args) {
        System.out.println("AccuracyRate er : " + theAccuracyRate());
        System.out.println("ErrorRate er : " + theErrorRate());
        System.out.println("Precision er : " + thePrecision());
        System.out.println("Recall er : " + theRecall());
        System.out.println("TPR er : " + theTPR());
        System.out.println("TNR er : " + theTNR());
        System.out.println("FPR er : " + theFPR());
        System.out.println("FNR er : " + theFNR());
    }

    //(1.1)= TP
    static double TP = 26.0;

    //(1.0)=FN
    static double FN = 55.0;

    //(0.1)=FP
    static double FP = 34.0;

    //(0.0)=TN
    static double TN = 191.0;


    static double N = TP + FN + FP + TN;
    static double accuracyRate;
    static double errorRate;
    static double precision;
    static double recall;
    static double TPR;
    static double TNR;
    static double FPR;
    static double FNR;

    public static double theAccuracyRate() {
        accuracyRate = (TP + TN) / N;
        return accuracyRate;
    }

    public static double theErrorRate() {
        errorRate = (FN + FP) / N;
        return errorRate;
    }

    public static double thePrecision() {
        precision = (TP / (TP + FP));
        return precision;
    }

    public static double theRecall() {
        recall = (TP / (TP + FN));
        return recall;
    }

    public static double theTPR() {
        TPR = (TP / (TP + FN));
        return TPR;
    }

    public static double theFPR() {
        FPR = (FP / (FP + TN));
        return FPR;
    }

    public static double theTNR() {
        TNR = (TN / (TN + FP));
        return TNR;
    }

    public static double theFNR() {
        FNR = (FN / (TP + FN));
        return FNR;
    }

}