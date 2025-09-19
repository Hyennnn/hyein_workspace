package exemple.section03.map;

import java.util.*;

public class Appliation {
    public static void main(String[] args) {
        // hashMap
        HashMap map = new HashMap();

        // key와 value 쌍으로 저장
        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33,234);

        // 저장 순서와 무관하게 저장
        System.out.println("map = " + map);

        map.put(12, "yellow banana");
        map.put(9, "yellow banana");
        // key 값은 중복 저장 안됨
        // 다시 put 하면 값이 수정됨 
        // value 값은 중복 가능함
        System.out.println("map = " + map);
        
        // value는 key 값을 통해 가지고 올 수 있음
        System.out.println("map.get(9) = " + map.get(9));
        
        // key 값을 통해 value 값 삭제 (entery)
        map.remove(9);
        System.out.println("map = " + map);

        System.out.println();
        // 문자열 타입을 키, 값으로 하는 Hash Map
        HashMap<String, String> hmap = new HashMap<>();
//        hmap.put(11,22); // 문자열이 아니라서 컴파일 에러
          hmap.put("one", "java");
          hmap.put("two", "mysql");
          hmap.put("three", "jdbc");
          hmap.put("four", "html");

        // Map 타입 순회 방법
        // 1. keySet() : key 순회
        Iterator<String> keyIter = hmap.keySet().iterator();
        while (keyIter.hasNext()) { // 커서
            String key = keyIter.next();
            String value = hmap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println();

        // 1-1. 향상된 for문 사용
        for (String key : hmap.keySet()) {
            String value = hmap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        // 2. values()
        Collection<String> values = hmap.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println("value = " + valueIter.next());
        }

        for(String value : hmap.values()){
            System.out.println("value = " + value);
        }

        // 3. entrySet()
        Set<Map.Entry<String,String>> set = hmap.entrySet();
        Iterator<Map.Entry<String,String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        for(Map.Entry<String, String > entry: hmap.entrySet()){
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }









    }
}
