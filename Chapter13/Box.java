package Chapter13;
//<T>데이터 타입을 지금저장 하지 않고 나중에 실행할 때 타입을 알려주겠다
public class Box<T> {
	private T value;
	public Box() {
	}
	
	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Box [value=%s]", value);
	}
	
}
