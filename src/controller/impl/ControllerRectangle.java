package controller.impl;

import controller.ControllerShape;
import model.impl.Rectangle;
import view.impl.ViewRectangle;

/**
 * Класс для связи расчета параметров прямоугольника и вывода их в консоль
 */
public class ControllerRectangle implements ControllerShape {
    /**
     * Поле объекта 'прямоугольник'
     */
    private Rectangle rectangle;
    /**
     * Поле представления объекта 'прямоугольник'
     */
    private ViewRectangle view;

    /**
     * Конструктор - создание нового экземпляра класса RectangleController с заданным объектом 'прямоугольник' и
     * его представлением
     *
     * @param view      представление объекта 'прямоугольник'
     * @param rectangle объект 'прямоугольник'
     */
    public ControllerRectangle(ViewRectangle view, Rectangle rectangle) {
        this.view = view;
        this.rectangle = rectangle;

    }

    /**
     * Метод вычисления и отображения площади прямоугольника
     */
    @Override
    public void getArea() {
        try {
            double area = rectangle.calculateArea();
            view.showArea(area);
        } catch (IllegalArgumentException e) {
            view.showDimensionsError();
        }
    }

    /**
     * Метод вычисления и отображения периметра прямоугольника
     */
    @Override
    public void getPerimeter() {
        try {
            double perimeter = rectangle.calculatePerimeter();
            view.showPerimeter(perimeter);
        } catch (IllegalArgumentException e) {
            view.showDimensionsError();
        }
    }
}

