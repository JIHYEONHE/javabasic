package chapter01;

public class loop01 {

	public static void main(String[] args) {
		int[] jumsu = {85,90,70,75,100,95,95,80,75,85};
	//jumsu 의 평균을 구해보자(while문으로 처리해보자)
		int i=0;
		int result =0;
		while(i<jumsu.length) { //i는 0~9까지 반복
			result=result+jumsu[i];
			i++; //0~9까지 반복. 결국i는 10이됨
		}
		System.out.println(result/((double)jumsu.length));
	}

}
