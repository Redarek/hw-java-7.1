package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    @Test
    public void sumSalesTest() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underAverageSalesTest() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.underAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overAverageSalesTest() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.overAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
