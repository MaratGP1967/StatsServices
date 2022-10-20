package ru.netology.stats.StatsServices.services;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long sum = service.sumSales(arr); //сумма всех продаж;
        long average = service.averageSales(arr); //среднее всех продаж;
        int max = service.numMonthMaxSales(arr); // номер месяца максимальных продаж;
        int min = service.numMonthMinSales(arr); // номер месяца минимальных продаж;
        int lowAvr = service.numMonthLowerAverageSales(arr); //Количество месяцев, в которых продажи были ниже среднего
        int upAvr = service.numMonthAboveAverageSales(arr); //Количество месяцев, в которых продажи были выше среднего

        System.out.println(sum);
        System.out.println(average);
        System.out.println(max);
        System.out.println(min);
        System.out.println(lowAvr);
        System.out.println(upAvr);
    }
}