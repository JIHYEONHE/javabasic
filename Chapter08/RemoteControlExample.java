package Chapter08;

public class RemoteControlExample {
public static void main(String[] args) {
//	RemoteControl rc;
//	rc= new Television();
//	rc = new Audio();
	RemoteControl rc = new Television(); 
	rc.tunrOn();
	rc = new Audio();
	rc.setVolume(9);
}
}
