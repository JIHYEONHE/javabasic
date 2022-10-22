package Chapter08;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void tunrOn(); // public abstract void turnOn(); abstract 이 생략되어있는 것

	void turnOff();

	void setVolume(int volume);
	
	default void run() {
		System.out.println("새로 만들어진 인어페이스의 default method");
	}
}
