package Chapter08;
//클래스 : 클래스 -> 상속 (extends)
//인터페이스 : 클래스 ->구현 (implements)
public class Television implements RemoteControl {
//필드
	private int volume;
	//turnOn() 추상 메소드의 실제 메소드
	@Override
	public void tunrOn() {
		System.out.println("TV를 켭니다.");
		
	}
    //turnOff() 추상 메소드의 실제 메소드
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}
	//SetVolume() 추상 메소드의 실제 메소드
	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume=MAX_VOLUME;
		}else if(volume<MIN_VOLUME) {
			this.volume=MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 TV 볼륨:" + this.volume);
	}

	

}
