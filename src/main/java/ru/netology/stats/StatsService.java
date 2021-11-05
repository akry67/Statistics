package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales){
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        return sum;
    }

    public int averageCompanySales(int[] sales){
        return sumSales(sales)/sales.length;
    }
}
