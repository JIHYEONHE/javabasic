package HOMEWORK;

import java.util.Arrays;
import java.util.Random;
//45개 짜리 배열을 만들고 1부터 45숫자를 다넣고 섞기 -임시로 변수 하나 만들고 temp에 넣어서 바꾸는 식으로 ->앞에서 부터 6개잘라서 로또번호 만들기,,,, 
public class Exercise1622 {
public static void main(String[] args) {
	
	int [] numbers = new int[45];
	for(int i=0;i<numbers.length;i++) {
		//int num = i+1;
		numbers[i] = i + 1; //1씩 더해가면서 45까지의 숫자를 0~44칸에 넣음
	}Random random = new Random();
	for(int i=0;i<numbers.length;i++) {
		int ranNum = random.nextInt(45); // 바꿀 순서를 랜덤으로 만들어줌
		
		int temp = numbers[i];  //numbers 를 temp에 넣어두고
		numbers[i]=numbers[ranNum]; //
		numbers[ranNum]=temp;
	}
	for(int i=0; i<6; i++) {
		System.out.println(numbers[i]+"");
	}
	
}
}
