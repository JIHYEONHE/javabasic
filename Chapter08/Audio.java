package Chapter08;

public class Audio implements RemoteControl {
private int volume;

//turnOn() 추상 메소드의 실제 메소드
	@Override
	public void tunrOn() {
		System.out.println("Audio를 켭니다.");
		
	}
  //turnOff() 추상 메소드의 실제 메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
		
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
		System.out.println("현재 Audio 볼륨:" + this.volume);
	}
	

}
