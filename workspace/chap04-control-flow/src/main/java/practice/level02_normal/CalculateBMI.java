package practice.level02_normal;

public class CalculateBMI {

    public void calculateBMI(double height, double weight){

        double bmi = weight / (height * height);

        if (bmi  < 20 ) {
            System.out.println("당신은 저체중 입니다.");
        } else if (bmi >= 20 && bmi < 25) {
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmi >=25 && bmi < 30) {
            System.out.println("당신은 과체중 입니다.");
        } else {
            System.out.println("당신은 비만 입니다.");
        }

    }
}
