package ru.netology.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalcRange_0_1000() {
        SQRService service = new SQRService();

        int actual = service.calcService(0, 1000);
        int expected = 22;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcRange_100_500() {
        SQRService service = new SQRService();

        int actual = service.calcService(100, 500);
        int expected = 13;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldCalcRange_500_1000() {
        SQRService service = new SQRService();

        int actual = service.calcService(500, 1000);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldCalcRange_9802_100000() {
        SQRService service = new SQRService();

        int actual = service.calcService(9802, 100000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

      @Test
    public void shouldCalcRange_0_99() {
      SQRService service = new SQRService();

    int actual = service.calcService(0, 99);
     int expected = 0;

        Assertions.assertEquals(expected, actual);
     }
}
