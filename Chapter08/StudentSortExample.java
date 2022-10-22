package Chapter08;

import java.util.Arrays;

public class StudentSortExample {
public static void main(String[] args) {
	Student[] students = {
			new Student("홍길동",20),
			new Student("김연수",26),
			new Student("허지현",30),
			new Student("이준혁",16),
			new Student("김강산",27),
			new Student("윤다영",34),
			new Student("성민정",19),
			new Student("이동민",6),
			new Student("박종환",51),
			new Student("길선주",62),
			};
	
	Arrays.sort(students); //comparable 이 되어잇으면 정렬을 해주는 것
	for(Student student : students) {
		System.out.println(student);
	}
}
}