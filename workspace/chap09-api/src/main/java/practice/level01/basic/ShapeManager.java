package practice.level01.basic;

import java.util.Arrays;

public class ShapeManager implements Resizable {
    private Shape[] shapes = new Shape[10];
    private int index;


    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        int length = this.shapes.length;
        shapes[index++] = shape;

        if (index >= length) {
            shapes = Arrays.copyOf(shapes, length * 2);
        }

    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */

       for (int i = 0; i < index; i++) {
           System.out.println("도형의 이름 : " + this.shapes[i].getClass().getName()+ ", 넓이 : " + this.shapes[i].calculateArea()
                + ", 둘레 : " + this.shapes[i].calculatePerimeter());
       }

    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        int areaSum = 0;
        for (int i = 0; i < this.shapes.length; i++) {
            // areaSum += shapes[i].calculateArea();
            if (this.shapes[i] != null) {
                areaSum += this.shapes[i].calculateArea();
            }

        }
        return areaSum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        int perimeterSum = 0;
        for (int i = 0; i < this.shapes.length; i++) {
            if (this.shapes[i] != null) {
                perimeterSum += this.shapes[i].calculatePerimeter();
            }
        }

        return perimeterSum;
    }

    @Override
    public void resize(double factor) {

    }
}
