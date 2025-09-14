package practice.level02_normal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Subject {

    public void PassOrFail (int korean, int math, int english) {

        int cutLineAvg = 60;
        int cutLineScore = 40;
        Map<String, Integer> map = new HashMap<>();
        map.put("국어", korean);
        map.put("수학", math);
        map.put("영어", english);

        double avg = (double) (korean + math + english) / 3;

        // 합격 : 평균점수가 60점 이상이면서 과목이 40점 이상인 조건
        for (String key : map.keySet()) {
           // System.out.println(key + " : " + map.get(key));
            int score = map.get(key);
            if (cutLineScore <= score ) {    // 과목마다 점수 미달 확인 (합격)
             //    System.out.println(key + "합격입니다.");
                if (avg >= cutLineAvg) {
                    System.out.println("합격입니다.");
                    break;
                } else {
                    System.out.println("평균 점수 미달로 불합격입니다.");
                }
            }  else {
                // 불합격
                System.out.println(key + " 점수 미달로 불합격입니다.");
            }
        }
    }
}
