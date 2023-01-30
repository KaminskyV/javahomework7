import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.StatService;

public class StatServiceTest {
 //    @ParameterizedTest
//    @CsvFileSource(files = "src/test/resources/Arrayyear.csv")
  //  void shouldCalcSum(int[] sales) {
    //     StatService service = new StatService();
 //        int expected = 180;
   //      int actual = service.calcsum(sales);
   //      Assertions.assertEquals(expected, actual);
 //    }
    @Test
    void shouldCalcSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calcsum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcAverageSum() {//средняя сумма продаж в мес
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        double actual = service.calcAverageValue(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() { //последний месяц с пиком продаж
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calcMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() { //последний месяц с минимумом продаж
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calcMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcUnAverage() { //количество мес, где продажи были меньше средней
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.calcCountMonthSumMinAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcUpAverage() { //количество мес, где продажи были больше средней
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        double actual = service.calcCountMonthSumMaxAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
