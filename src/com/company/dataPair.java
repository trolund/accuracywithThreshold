package com.company;

public class dataPair {

    private double acctualY;
    private double predictedY;
    private int predictedYEval;

    public dataPair(double acctualY, double predictedY) {
        this.acctualY = acctualY;
        this.predictedY = predictedY;
    }

    public double getAcctualY() {
        return acctualY;
    }

    public void setAcctualY(double acctualY) {
        this.acctualY = acctualY;
    }

    public double getPredictedY() {
        return predictedY;
    }

    public void setPredictedY(double predictedY) {
        this.predictedY = predictedY;
    }

    public int getPredictedYEval() {
        return predictedYEval;
    }

    public void setPredictedYEval(int predictedYEval) {
        this.predictedYEval = predictedYEval;
    }
}
