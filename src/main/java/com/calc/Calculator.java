package com.calc;

public class Calculator {

    public double getSum(double firstValue, double secondValue) {
        return (double) Math.round((firstValue + secondValue) * 100000) / 100000;
    }

    public double getSubtraction(double firstValue, double secondValue) {
        return (double) Math.round((firstValue - secondValue) * 100000) / 100000;
    }

    public double getMultiplication(double firstValue, double secondValue) {
        return (double) Math.round((firstValue * secondValue) * 100000) / 100000;
    }

    public double getDivide(double firstValue, double secondValue) {
        if (firstValue > 0.0d && secondValue == 0.0d) {
            return Double.POSITIVE_INFINITY;
        } else if (firstValue < 0.0d && secondValue == 0.0d) {
            return Double.NEGATIVE_INFINITY;
        } else if (firstValue == 0.0d && secondValue == 0.0d) {
            return Double.NaN;
        } else {
            return (double) Math.round((firstValue / secondValue) * 100000) / 100000;
        }
    }
}
