package exemple.section01.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Collection<String> collectionSet = new HashSet<>();

        hashSet.add(new String("java"));
        hashSet.add(new String("mysql"));
        hashSet.add(new String("jdbc"));
        hashSet.add(new String("html"));
        hashSet.add(new String("css"));
        hashSet.add(new String("java"));

        // 1. 저장 순서가 유지가 안됨 (HashSet은 Hash 연산을 통해 저장 관리)
        // 2.중복 값은 저장 되지 않는다.(동일 객체 뿐만 아니라 동등 객체도 중복 판별
        // String의 재정의 된 hashCode, equlas 활용)
        System.out.println("hashSet = " + hashSet);

        // 재정의 된 equalㄴ 통해 포함 여부를 확인, 동등 객체가 있음 확인
        System.out.println(hashSet.add(new String("html")));

        // set 데이터 순회 방법
        // 1. 배열로 변경 ( toArray())
        Object[] arr = hashSet.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + " :" +arr[i]);
        }

        // 2.Iterable의 interator 메소드(반복자)
        Iterator<String> iter = hashSet.iterator(); // 삭제, 수정 기능 됨
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // 3. 향상 된 for문 (보기)
        for(String s : hashSet){
            System.out.println("s = " + s);
            hashSet.remove(s);
        }
    }
}
