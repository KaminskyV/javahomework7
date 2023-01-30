package ru.netology;

public class Main {
    public static void main(String[] args) {
StatService service = new StatService();
int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
int sum = service.calcsum(sales);
double average = service.calcAverageValue(sales);
int MinSum = service.calcMinSales(sales);
int MaxSum = service.calcMaxSales(sales);
        int MinAverSum = service.calcCountMonthSumMinAverage(sales);
        int MaxAverSum = service.calcCountMonthSumMaxAverage(sales);
        System.out.println(sum + ": Сумма всех продаж");
        System.out.println(average + ": Средняя сумма продаж в месяц");
        System.out.println(MinSum + ": Номер месяца с минимальными продажами");
        System.out.println(MaxSum + ": Номер месяца с максимальными продажами");
        System.out.println(MinAverSum + ": Количество месяцев, в которых продажи были ниже среднего");
        System.out.println(MaxAverSum + ": Количество месяцев, в которых продажи были выше среднего");
    }

}