package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sellsData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumOfAllSells() {//Сумма всех продаж
        int expectedSum = 180;
        int actualSumOfAllSells = service.allSells(sellsData);

        Assertions.assertEquals(expectedSum, actualSumOfAllSells);
    }

    @Test
    public void averageValueOfSells() {//Средняя сумма продаж в месяц
        int expectedAverageValue = 15;
        int actualAverageOfSells = service.averageValue(sellsData);

        Assertions.assertEquals(expectedAverageValue, actualAverageOfSells);
    }

    @Test
    public void monthWithMaxSumOfSells() {//номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.monthMaxSumOfSells(sellsData);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void monthWithMinSumOfSells() {//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int expectedMinMonth = 9;
        int actualMinMonth = service.monthMinSumOfSells(sellsData);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void monthWithLessOfAverage() {//количество месяцев, в которых продажи были ниже среднего
        int expectedLessMonth = 5;
        int actualLessMonth = service.lessThanAverage(sellsData);

        Assertions.assertEquals(expectedLessMonth, actualLessMonth);
    }

    @Test
    public void monthWithMoreOfAverage() {//количество месяцев, в которых продажи были выше среднего
        int expectedMoreMonth = 5;
        int actualMoreMonth = service.moreThanAverage(sellsData);

        Assertions.assertEquals(expectedMoreMonth, actualMoreMonth);
    }
}