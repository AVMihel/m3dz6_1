import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.services.StatsServise;

public class StatsServiceTest {


    // 1. Сумма всех продаж - 180
    @Test
    public void shouldFindAmount() {
        StatsServise service = new StatsServise();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 180;
        long actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }


    // 2. Средняя сумма продаж в месяц - 15
    @Test
    public void shouldFindAverageAmount() {
        StatsServise service = new StatsServise();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAmount = 15;
        long actualAmount = service.amountAverageSales(sales);


        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    // 3. Номер месяца продаж на максимальную сумму
    @Test
    public void shouldFindMaxBetweenEnds() {
        StatsServise service = new StatsServise();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);


        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    // 4. Номер месяца продаж на минимальную сумму
    @Test
    public void shouldFindMinBetweenEnds() {
        StatsServise service = new StatsServise();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);


        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    // 5. Количество месяцев продаж ниже среднего
    @Test
    public void shouldFindNumberMonthsSalesBelowAverage() {
        StatsServise service = new StatsServise();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.monthsSalesBelowAverage(sales);


        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    // 6. Количество месяцев продаж выше среднего
    @Test
    public void shouldFindNumberMonthsSalesAboveAverage() {
        StatsServise service = new StatsServise();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumber = 5;
        int actualNumber = service.monthsSalesAboveAverage(sales);


        Assertions.assertEquals(expectedNumber, actualNumber);
    }
}
