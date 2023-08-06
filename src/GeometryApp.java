
import controller.impl.ControllerCircle;
import controller.impl.ControllerRectangle;
import controller.impl.ControllerTriangle;
import model.impl.Circle;
import model.impl.Rectangle;
import model.impl.Triangle;
import view.impl.ViewCircle;
import view.impl.ViewRectangle;
import view.impl.ViewTriangle;

/**
 * Класс `GeometryApp` служит для запуска приложения и связывает все компоненты вместе.
 * 1. Необходимо создать экземпляр конкретной геометрической фигуры.
 * 2. Необходимо создать экземпляр класса View этой фигуры
 * 3. Необходимо создать экземпляр Controller этой фигуры
 * 4. Через экземпляр класса контроллера запустить необходимые методы
 */
public class GeometryApp {

    public static void main(String[] args) {
        try {
            Circle circle = new Circle(4);
            ViewCircle circleView = new ViewCircle();
            ControllerCircle controllerCircle = new ControllerCircle(circleView, circle);
            controllerCircle.getArea();
            controllerCircle.getPerimeter();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка ввода радиуса круга: " + e.getMessage());
        }
        try {
            Rectangle rectangle = new Rectangle(56,-3 );
            ViewRectangle rectangleView = new ViewRectangle();
            ControllerRectangle rectangleController = new ControllerRectangle(rectangleView, rectangle);
            rectangleController.getArea();
            rectangleController.getPerimeter();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при вводе сторон прямоугольника : " + e.getMessage());
        }
        try {
            Triangle triangle = new Triangle(7, 5 ,9);
            ViewTriangle triangleView = new ViewTriangle();
            ControllerTriangle triangleController = new ControllerTriangle(triangleView, triangle);
            triangleController.getArea();
            triangleController.getPerimeter();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка при вводе сторон треугольника: " + e.getMessage());
        }
        

    }
}
