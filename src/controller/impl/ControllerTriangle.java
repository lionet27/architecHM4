package controller.impl;

import controller.ControllerShape;

import model.impl.Triangle;
import view.impl.ViewTriangle;

/**
 * РљР»Р°СЃСЃ РґР»СЏ СЃРІСЏР·Рё СЂР°СЃС‡РµС‚Р° РїР°СЂР°РјРµС‚СЂРѕРІ С‚СЂРµСѓРіРѕР»СЊРЅРёРєР° Рё РІС‹РІРѕРґР° РёС… РІ РєРѕРЅСЃРѕР»СЊ
 */
public class ControllerTriangle implements ControllerShape{
    /**
     * Поле объекта 'треугольник'
     */
    private Triangle triangle;
    /**
     * Поле представления объекта 'треугольник'
     */
    private ViewTriangle view;

    /**
     * Конструктор - создание нового экземпляра класса TriangleController с заданным объектом 'треугольник' и
     * его представлением
     *
     * @param view     представление объекта 'треугольник'
     * @param triangle объект 'треугольник'
     */
    public ControllerTriangle(ViewTriangle view, Triangle triangle) {
        this.view = view;
        this.triangle = triangle;

    }

    /**
     * РњРµС‚РѕРґ РІС‹С‡РёСЃР»РµРЅРёСЏ Рё РѕС‚РѕР±СЂР°Р¶РµРЅРёСЏ РїР»РѕС‰Р°РґРё С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°
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
     * РњРµС‚РѕРґ РІС‹С‡РёСЃР»РµРЅРёСЏ Рё РѕС‚РѕР±СЂР°Р¶РµРЅРёСЏ РїРµСЂРёРјРµС‚СЂР° С‚СЂРµСѓРіРѕР»СЊРЅРёРєР°
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
