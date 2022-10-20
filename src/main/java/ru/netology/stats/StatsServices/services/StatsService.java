package ru.netology.stats.StatsServices.services;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;  //сумма по всем продажам
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;  // среднее по всем продажам
    }

    public int numMonthMaxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1; // последний месяц максимальных продаж
    }

    public int numMonthMinSales(long[] sales) {
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
        return minMonth + 1;   // последний месяц минимальных продаж
    }

    public int numMonthLowerAverageSales(long[] sales) {
        int numMonth = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                numMonth++;
            }
        }
        return numMonth;   // количество месяцев, в которых продажи были ниже среднего
    }

    public int numMonthAboveAverageSales(long[] sales) {
        int numMonth = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                numMonth++;
            }
        }
        return numMonth;   // количество месяцев, в которых продажи были выше среднего
    }
}
