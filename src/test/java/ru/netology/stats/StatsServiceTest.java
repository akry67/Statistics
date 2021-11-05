package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumSales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumSales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldaverageCompanySales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageCompanySales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        long actual = service.maxSales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();

        long[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        long actual = service.minSales(enterpriseSales);

        assertEquals(expected, actual);
    }
    @Test
    void shouldMonthsMinAverageCompanySales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthsMinAverageCompanySales(enterpriseSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthsMaxAverageCompanySales() {
        StatsService service = new StatsService();

        int[] enterpriseSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.monthMaxAverageCompanySales(enterpriseSales);

        assertEquals(expected, actual);
    }
}