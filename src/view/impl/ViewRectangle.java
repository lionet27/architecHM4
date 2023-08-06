package view.impl;


import view.ViewShape;

/**
 * Класс представления параметров прямоугольника в консоли, наследник интерфейса ShapeView
 */
public class ViewRectangle implements ViewShape {
    /**
     * Метод для вывода площади прямоугольника в консоль
     *
     * @param area площадь прямоугольника
     */
    @Override
    public void showArea(double area) {
        System.out.println("Площадь прямоугольника: " + area);
    }

    /**
     * Метод для вывода периметра прямоугольника в консоль
     *
     * @param perimeter периметр прямоугольника
     */
    @Override
    public void showPerimeter(double perimeter) {
        System.out.println("Периметр прямоугольника: " + perimeter);
    }

    /**
     * Метод для вывода ошибки некорректных значений длины или ширины прямоугольника
     */
    public void showDimensionsError() {
        System.out.println("Ошибка! Стороны прямоугольника должны быть положительными числами.");
    }

}
