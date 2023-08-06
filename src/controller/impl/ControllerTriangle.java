package controller.impl;

import controller.ControllerShape;

import model.impl.Triangle;
import view.impl.ViewTriangle;

/**
 * Класс для связи расчета параметров треугольника и вывода их в консоль
 */
public class ControllerTriangle implements ControllerShape{
    /**
     * ���� ������� '�����������'
     */
    private Triangle triangle;
    /**
     * ���� ������������� ������� '�����������'
     */
    private ViewTriangle view;

    /**
     * ����������� - �������� ������ ���������� ������ TriangleController � �������� �������� '�����������' �
     * ��� ��������������
     *
     * @param view     ������������� ������� '�����������'
     * @param triangle ������ '�����������'
     */
    public ControllerTriangle(ViewTriangle view, Triangle triangle) {
        this.view = view;
        this.triangle = triangle;

    }

    /**
     * Метод вычисления и отображения площади треугольника
     */
    @Override
    public void getArea() {
        try {
            double area = triangle.calculateArea();
            view.showArea(area);
        } catch (IllegalArgumentException e) {
            view.showSideError();
        }
    }

    /**
     * Метод вычисления и отображения периметра треугольника
     */

    @Override
    public void getPerimeter() {
        try {
            double perimeter = triangle.calculatePerimeter();
            view.showPerimeter(perimeter);
        } catch (IllegalArgumentException e) {
            view.showSideError();
        }
    }
}
