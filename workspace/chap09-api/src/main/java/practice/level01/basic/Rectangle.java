package practice.level01.basic;

public class Rectangle  extends Shape implements Resizable{
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double factor) {

    }

    @Override
    double calculateArea() {
        return this.width * this.height;
    }

    @Override
    double calculatePerimeter() {

        // 정사각형
        if (this.width == this.height) {
            return this.height * 4;
        }

        // 직사각형
        return (this.width + this.height) * 2;
    }
}
