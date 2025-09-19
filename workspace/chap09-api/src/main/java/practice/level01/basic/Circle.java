package practice.level01.basic;

public class Circle extends Shape {
    private double radius;  // 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return  Math.pow(this.radius, 2) * java.lang.Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2 *  java.lang.Math.PI * this.radius;
    }
}
