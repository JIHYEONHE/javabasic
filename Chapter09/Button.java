package Chapter09;

public class Button {
OnClickListener listener; //인터페이스 타입필드
void setOnClickListener(OnClickListener listener) {   //매개변수의 다형성
	this.listener= listener;
}

void touch() {          //구현 객체의 onclick()메소드 호출
	listener.onClick();
}

static interface OnClickListener{  //중첩인터페이스                 
	void onClick();
}
}

//new Searchable(){
//	public void search(String url) {
//		System.out.println(url);
//	}

//Searchable s = new Searchable(){
// public void search (String url){
// System.out.pritln(url);
//};

//	}.search("홍길동")