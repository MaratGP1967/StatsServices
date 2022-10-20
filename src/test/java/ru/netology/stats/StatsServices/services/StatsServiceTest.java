package ru.netology.stats.StatsServices.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumSales(sales);

        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSales(sales);

        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.numMonthMaxSales(sales);

        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.numMonthMinSales(sales);

        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumMonthLowerAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.numMonthLowerAverageSales(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNumMonthAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.numMonthAboveAverageSales(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}
//180
//15
//8
//9
//5
//5