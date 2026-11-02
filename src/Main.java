import oop.ocp.*;

void main() {
    System.out.println(AreaCalculator.calculateArea(new Rectangle(5,6)));
    System.out.println(AreaCalculator.calculateArea(new Circle(14)));
    System.out.println(AreaCalculator.calculateArea(new Ellipse(5,6)));
}