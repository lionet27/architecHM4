package model.impl;

import model.IShape;

/**
 * Класс геом. фигуры "Прямоугольник"  наследник интерфейса IShape
 */
public class Rectangle implements IShape {
    /**
     * Поле длина прямоугольника
     */
    private double length;
    /**
     * Поле ширина прямоугольника
     */
    private double width;

    /**
     *
     * @param lenght длина прямоугольника (должна быть положительным числом)
     * @param width  ширина прямоугольника (должна быть положительным числом)
     * @throws IllegalArgumentException (Нельзя вводить числа <= 0)
     */
    public Rectangle(double lenght, double width) {
        if (width <= 0 || lenght <= 0) {
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными числами");
        }
        this.length = lenght;
        this.width = width;
    }

    /**
     * Метод расчета площади прямоугольника
     *
     * @return площадь прямоугольника (тип double)
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Метод расчета периметра прямоугольника
     *
     * @return периметр прямоугольника (тип double)
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
