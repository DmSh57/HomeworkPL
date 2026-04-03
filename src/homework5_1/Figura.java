package homework5_1;
/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив
 */

public abstract class Figura {

    public abstract double getArea();
    public abstract double getPerimetr();

}
