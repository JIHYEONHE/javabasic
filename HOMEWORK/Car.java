package HOMEWORK;

public class Car {
//필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//생성자
	Car(){
	}
//생성자2
	Car(String model){
		this.model = model;
	}
//생성자3
	Car(String model, String color){
		this.model=model;
		this.color=color;
	}
//생성자4
	Car(String model,String color,int maxspeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxspeed;
	}
	
}
