package Framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<Student,Integer> map = new HashMap<>();
	map.put(new Student(1,"홍길동"), 90);
	map.put(new Student(2,"이순신"), 87);
	map.put(new Student(3,"신용권"), 100);
	map.put(new Student(4,"조민우"), 63);
	map.put(new Student(3,"신용권"), 94);
	map.put(new Student(5,"신용권"), 80);
	
	System.out.println("총 갯수:"+map.size());
	
	System.out.println("신용권 점수:"+map.get(new Student(3,"신용권")));
	
	map.remove(new Student(5,"신용권"));
	System.out.println("총 갯수:"+ map.size());
	
	//객체를 하나씩 처리 (엔트리를 사용)
	Set<Entry<Student,Integer>> entrySet = map.entrySet(); 
	//set 이라는 목록형태에 entry가 들어가 있는 것  키타입 student value는 integer
	for (Entry<Student, Integer> entry : entrySet) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	//2.key를 이용
	System.out.println();
	Set<Student> keySet = map.keySet();
	for(Student student : keySet) {
		System.out.println(student+":"+map.get(student));
	}
	//3.value를 이용: value값 만 가져온다.
	System.out.println();
	Collection<Integer> values = map.values();  //collection ->최상위 인터페이스
	for (Integer integer : values) {
		System.out.println(integer);
	}
	
	//전체 지우기
	map.clear(); //put한 모든 데이터 삭제

}
}
