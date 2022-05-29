package ru.netology.statistic;

public class Conditioner {

    // Создадим ПОЛЕ (собств. ячейка обьекта) - тип ячейки внутри класса но вне методов
    // теперь у каждого объекта будет своя собств ячейка - поле
    private int currentTemperature;

    public void setCurrentTemperature(int currentTemperature) {
        // заполняем поле из того что нам передали
        // делаем условия для early exit
        if (currentTemperature < 0) {
            return;
        }
        if (currentTemperature > 30) {
            return;
        }
        this.currentTemperature = currentTemperature;  // используем this. птмч у метода есть переменная с тем же именем
    }

    public int getCurrentTemperature() {
        return currentTemperature;       // this. не нужен потому что у метода нет переменной
    }

    public void increase50percent() {
        int newCurrentTemperature = currentTemperature * 150 / 100;
//        this.currentTemperature = newCurrentTemperature;
        setCurrentTemperature(newCurrentTemperature);   // вызовем метод для проверки на диапозон возможных Т
    }

}
