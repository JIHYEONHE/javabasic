package chapter03;

public class HW4 {
public static void main(String[] args) {
	int pencils = 534;
	int students = 30;
	//학생 1명이 가지는 연필 개수
	int pencilsPerstudent = (pencils/ students);
	System.out.println(pencilsPerstudent);
	//남은 연필 개수 
	int pencilsLeft = (pencils % students);
	System.out.println(pencilsLeft);
}
}
