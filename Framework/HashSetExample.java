package Framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Board> set = new HashSet<>();
		set.add(new Board("제목1","내용1","작성자1"));
		set.add(new Board("제목2","내용2","작성자2"));
		set.add(new Board("제목3","내용3","작성자3"));
	
		set.add(new Board("제목1","내용1","작성자1"));
		System.out.println(set.size());
		
		//jdk 1.5
		for(Board board : set) {       //밑에 iterator문이랑 똑같은 기능
			System.out.println(board);
		}
		
		Iterator<Board> iterator = set.iterator(); //iterator 로 set 에있는 board데이터들을 반복적으로 가져온다
		while (iterator.hasNext()) {
			Board board = iterator.next(); //내용이 있으면 next로 꺼내 Board에 담음
			System.out.println(board);
		}
		
		set.remove(new Board("제목2","내용2","작성자2"));
		System.out.println(set.size());
	}
}
