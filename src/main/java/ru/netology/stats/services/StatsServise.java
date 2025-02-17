package ru.netology.stats.services;

public class StatsServise {

    // 1. Сумма всех продаж
    public long amountSales(long[] sales) {
        long ammount = 0;
        for (long i : sales) {
            ammount += i;
        }
        return ammount;
    }

    // 2. Средняя сумма продаж в месяц
    public long amountAverageSales(long[] sales) {
        long ammount = amountSales(sales);
        long ammountAverage = ammount / 12;

        return ammountAverage;
    }

    // 3. Номер месяца продаж на максимальную сумму

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

// 4. Номер месяца продаж на минимальную сумму

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    // 5. Количество месяцев продаж ниже среднего
    public int monthsSalesBelowAverage(long[] sales) {

        int numberMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < amountAverageSales(sales)) {
                numberMonths++;
            }
        }

        return numberMonths;
    }

    // 6. Количество месяцев продаж выше среднего
    public int monthsSalesAboveAverage(long[] sales) {

        int numberMonths = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > amountAverageSales(sales)) {
                numberMonths++;
            }
        }

        return numberMonths;
    }
}