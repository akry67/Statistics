package ru.netology.stats;

public class StatsService {

    public int sumSales(long[] sales){
        int sum = 0;
        for (long sale : sales){
            sum += sale;
        }
        return sum;
    }

    public long averageCompanySales(long[] sales){
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
    public int monthsMinAverageCompanySales (long[] sales){
        int counter = 0;
        int numberMonthMinAvr =0;
        int averageSale = sumSales(sales)/sales.length;
        for (long sale : sales) {
            if (sale < averageSale){
                numberMonthMinAvr = counter ++;
            }
        }
        return counter;
    }

    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int monthMaxAverageCompanySales (long[] sales){
        int counter = 0;
        int numberMonthMaxAvr =0;
        int averageSale = sumSales(sales)/sales.length;
        for (long sale : sales) {
            if (sale > averageSale){
                numberMonthMaxAvr = counter ++;
            }
        }
        return counter;
    }
}
