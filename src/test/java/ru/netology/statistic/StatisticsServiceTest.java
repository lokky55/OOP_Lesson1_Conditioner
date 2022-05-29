package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    void setCurrentTemp() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(15);   // cond.currentTemperature = 15 (if public)
        int actual = cond.getCurrentTemperature();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void outOfCurrentUnderMin() {
        Conditioner cond = new Conditioner();
//        cond.currentTemperature = 40;          // обращаемся к ячейке и задаем значение
        cond.setCurrentTemperature(-10);

        int actual = cond.getCurrentTemperature(); //cond.currentTemperature;  // достать значение из ячейки и присвоить значение переменной
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void outOfCurrentAboveMax() {
        Conditioner cond = new Conditioner();
//        cond.currentTemperature = 40;          // обращаемся к ячейке и задаем значение
        cond.setCurrentTemperature(100);

        int actual = cond.getCurrentTemperature(); //cond.currentTemperature;  // достать значение из ячейки и присвоить значение переменной
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void increase50percent() {
        Conditioner cond = new Conditioner();

        cond.setCurrentTemperature(10);
        cond.increase50percent();

        int actual = cond.getCurrentTemperature();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

}
