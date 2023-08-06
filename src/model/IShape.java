package model;

/**
 * Абстрактный интерфейс геометрической фигуры
 */
public interface IShape {
    /**
     * Метод для расчета площади фигуры
     */
    double calculateArea();

    /**
     * Метод для расчета периметра фигуры
     */
    double calculatePerimeter();
}
