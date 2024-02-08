package ru.netology.stats;

public class StatsService {

    public static int allSells(int[] sellsData) {//Сумма всех продаж\
        int sum = 0;
        for (int i = 0; i < sellsData.length; i++) {
            sum = sum + sellsData[i];
        }
        return sum;
    }

    public static int averageValue(int[] sellsData) {//Средняя сумма продаж в месяц
        int sumForAverage = allSells(sellsData);
        int average = sumForAverage / sellsData.length;
        return average;
    }

    public static int monthMaxSumOfSells(int[] sellsData) {//номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int maxMonth = 0;
        for (int i = 0; i < sellsData.length; i++) {
            if (sellsData[i] >= sellsData[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public static int monthMinSumOfSells(int[] sellsData) {//номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;
        for (int i = 0; i < sellsData.length; i++) {
            if (sellsData[i] <= sellsData[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public static int lessThanAverage(int[] sellsData) {//количество месяцев, в которых продажи были ниже среднего
        int lessAverageDays = 0;
        for (int i = 0; i < sellsData.length; i++) {
            if (sellsData[i] < averageValue(sellsData)) {
                lessAverageDays++;
            }
        }
        return lessAverageDays;
    }

    public static int moreThanAverage(int[] sellsData) {//количество месяцев, в которых продажи были выше среднего
        int moreAverageDays = 0;
        for (int i = 0; i < sellsData.length; i++) {
            if (sellsData[i] > averageValue(sellsData)) {
                moreAverageDays++;
            }
        }
        return moreAverageDays;
    }
}