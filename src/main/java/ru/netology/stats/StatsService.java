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

    public int maxSales(long[] sales){
        int maxMonth =0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]){
                maxMonth = month;
            }
            month = month +1;
        }
        return maxMonth +1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int monthsMinAverageCompanySales (int[] sales){
        int counter = 0;
        int numberMonthMinAvr =0;
        for (int sale : sales) {
            if (sale < sumSales(sales)/sales.length){
                numberMonthMinAvr = counter ++;
            }
        }
        return counter;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int monthMaxAverageCompanySales (int[] sales){
        int counter = 0;
        int numberMonthMaxAvr =0;
        for (int sale : sales) {
            if (sale > sumSales(sales)/sales.length){
                numberMonthMaxAvr = counter ++;
            }
        }
        return counter;
    }
}
