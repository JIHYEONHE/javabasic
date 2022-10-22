package Chapter08;

public class Myclass {

	RemoteControl control;

	public MyClass() {
		control = new Television();
	}

	public MyClass(RemoteControl control) {
		this.control = control;
		control.turnOn();
		control.setVolume(5);
	}

	void methodA() {
		RemoteControl control = new Audio();
		control.tunrOn();
		control.setVolume(5);
	}

	void mehtodB() {
		control.turnOn();
		control.setVolume(5);
	}

}
