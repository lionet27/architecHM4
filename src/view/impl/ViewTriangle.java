package view.impl;

import view.ViewShape;

/**
 * Класс представления параметров треугольника в консоли, наследник интерфейса ShapeView
 */
public class ViewTriangle implements ViewShape {
    /**
     * Метод для вывода площади треугольника в консоль
     *
     * @param area площадь треугольника
     */
    @Override
    public void showArea(double area) {
        System.out.println("Площадь треугольника: " + area);
    }

    /**
     * Метод для вывода периметра треугольника в консоль
     *
     * @param perimeter периметр треугольника
     */
    @Override
    public void showPerimeter(double perimeter) {
        System.out.println("Периметр треугольника: " + perimeter);
    }

    /**
     * Метод для вывода ошибки некорректного значения сторон треугольника
     */
    public void showSideError() {
        System.out.println("Ошибка!  Все стороны треугольника должны быть положительными числами.");
    }
}
