package com.company.AverageRelativeDensity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageRelativeDensityKNN {

    private static final Scanner scanner = new Scanner(System.in);
    private static List<Observation> obsList = new ArrayList<>();
    private static int K = Integer.MIN_VALUE;

    private static double densityOfO(double[] distances) {
        double sum = 0;
        for (double d : distances) {
            sum += d;
        }
        return Math.pow((1.0 / K) * sum, -1);
    }

    private static double ard() {
        double sum = densityOfO(obsList.get(0).distances);
        obsList.remove(0);

        double densitySum = 0;

        for (Observation o : obsList) {
            densitySum += densityOfO(o.distances);
        }

        return sum / ((1.0 / K) * densitySum);
    }

    public static void main(String[] args) {
        System.out.println("Indtast K (KNN): ");
        K = scanner.nextInt();

        for (int i = 0; i < K + 1; i++) {
            System.out.println("Laver observation " + (i + 1) + "");
            obsList.add(new Observation(K, i));
        }

        System.out.println("Observationer er lavet færdigt.");
        System.out.println("Resultat: " + ard());
    }

    static class Observation {
        double[] distances;
        Observation(int K, int index) {
            distances = new double[K];
            for (int i = 0; i < distances.length; i++) {
                System.out.println("Indtast distance " + (i + 1) + " (ud af " + K + ") til observation " + (index + 1) + " (ud af " + (K + 1) + ") (Brug komma ','): ");
                distances[i] = scanner.nextDouble();
            }
        }
    }

}