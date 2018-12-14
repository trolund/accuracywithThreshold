package com.company.Threshold;


import java.util.ArrayList;

public class Main {

    private static double[] thresholdvalues = {0.35, 0.45, 0.55, 0.65};

    private static ArrayList<dataPair> data = new ArrayList<>();

    private static double[] listOfAccuracy = new double[thresholdvalues.length];




    public static void main(String[] args) {
        // set data
        data.add(new dataPair(1,0.6));
        data.add(new dataPair(0,0.4));
        data.add(new dataPair(1,0.5));
        data.add(new dataPair(1,0.1));
        data.add(new dataPair(0,0.1));

        for(int x =0; x < thresholdvalues.length; x++){
            double[][] confusionMatrix = new double[2][2];
            double threshold = thresholdvalues[x];

            for (dataPair y : data) {
                y.setPredictedYEval(eval(threshold, y));

                if(y.getPredictedYEval() == 1 && y.getAcctualY() == y.getPredictedYEval()){
                    // TP
                    confusionMatrix[0][0] +=1;
                }
                if(y.getPredictedYEval() == 0 && y.getAcctualY() == y.getPredictedYEval()){
                    // TN
                    confusionMatrix[1][1] += 1;
                }
                if(y.getPredictedYEval() == 1 && y.getAcctualY() != y.getPredictedYEval()){
                    // FP
                    confusionMatrix[1][0] += 1;
                }
                if(y.getPredictedYEval() == 0 && y.getAcctualY() != y.getPredictedYEval()){
                    // FN
                    confusionMatrix[0][1] += 1;
                }
            }
            calAccuracy(x, confusionMatrix) ;
        }

        double max = 0;
        int indexOfMax = 0;

        for (int z = 0; z < listOfAccuracy.length; z++) {


            if(listOfAccuracy[z] > max){
                max = listOfAccuracy[z];
                indexOfMax = z;
            }
        }

        System.out.println("Best accuracy: " + listOfAccuracy[indexOfMax] + ", Errorrate: " + (1-listOfAccuracy[indexOfMax]) +  " --> with threshold : " + thresholdvalues[indexOfMax]);
    }

    private static int eval(double theshold, dataPair data){
        if(data.getPredictedY() >= theshold) return 1;
        else return 0;
    }

    private static void calAccuracy(int x, double[][] confusionMatrix){
        listOfAccuracy[x] = (confusionMatrix[0][0] + confusionMatrix[1][1])/(confusionMatrix[0][0] + confusionMatrix[1][1] + confusionMatrix[1][0] + confusionMatrix[0][1]);
    }
}
