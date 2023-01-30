package ru.netology;

import javax.swing.*;

public class StatService {
    public int calcsum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum; // сумма всех продаж
    }

    public double calcAverageValue(int[] sales) {
        return calcsum(sales) / sales.length; //средняя сумма продаж
    }

    public int calcMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calcMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calcCountMonthSumMinAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < calcAverageValue(sales))
                count++;
        }
        return count;
    }

    public int calcCountMonthSumMaxAverage(int[] sales) {
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= calcAverageValue(sales))
                count++;
        }
        return count;
    }
}
