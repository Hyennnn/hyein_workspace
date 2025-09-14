package practice.level02_normal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class FruitPrice {

   public Map<String, Object> fruit() {
       Map<String, Object> map = new HashMap<>();
       map.put("사과", 1000);
       map.put("바나나", 3000);
       map.put("복숭아", 2000);
       map.put("키위", 5000);

    return map;
   }

   public void fruitList() {

       Map<String, Object> fruitMap = fruit();
       Iterator<String> fruit = fruitMap.keySet().iterator();
       for (String key : fruitMap.keySet()) {
           System.out.println(key + " : " + fruitMap.get(key) + "원");
       }
   }

   public void fruitPrice(String fruitName) {
       Map<String, Object> fruitMap = fruit();
       for (String key : fruitMap.keySet()) {

           if (key.equals(fruitName)) {
               System.out.println(fruitName + "의 가격은 " + fruitMap.get(key) + "입니다.");
           }
       }

   }
}
