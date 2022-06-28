package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum / sales.length);
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
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

    public long underAverageSales(long[] sales) {
        long sum = 0;
        long count = 0;
        for (long sale : sales) {
            sum += sale;
        }
        long average = sum / sales.length;

        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int overAverageSales(long[] sales) {
        int sum = 0;
        int count = 0;

        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;

        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }

}
