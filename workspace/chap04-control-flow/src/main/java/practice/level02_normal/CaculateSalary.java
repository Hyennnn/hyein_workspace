package practice.level02_normal;

import java.util.HashMap;
import java.util.Map;

public class CaculateSalary {


    public void caculateSalary(int salary, int sales){

        double bonus = 0;
        if (10000000 > sales) {
            // 1000만원 미만
            bonus = 0;
        } else if (10000000 <= sales && sales < 30000000) {
            bonus = 0.01;
        } else if (30000000 <= sales && sales < 50000000) {
            bonus = 0.03;
        } else if (50000000 <= sales) {
            bonus = 0.05;
        }

        // 보너스 금액
        long bonusSalary = Math.round(sales * bonus);
        // 총 금여 = 월 금여 + (매출액 * 보너스율)
        long totalSalary = salary + bonusSalary;


        System.out.println("===========================");
        System.out.println("매출액 : " + sales);
        System.out.println("보너스율: " + Math.round(bonus * 100) + "%");
        System.out.println("월 급여:" + salary);
        System.out.println("보너스 금액:" + bonusSalary);
        System.out.println("===========================");
        System.out.println("총 금여: " + totalSalary);

    }

    public Map<Integer,Integer> salesList(){

        Map<Integer,Integer> sales = new HashMap<>();
        sales.put(50000000 , 5);
        sales.put(30000000 , 3);
        sales.put(10000000 , 1);
        sales.put(10000000 , 0);

        return sales;
    }
}
