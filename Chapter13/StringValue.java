package Chapter13;

public class StringValue {
private String Value;

public StringValue(String value) {
	Value = value;
}

public String getValue() {
	return Value;
}

public void setValue(String value) {
	Value = value;
}

@Override
public String toString() {
	return String.format("StringValue [Value=%s]", Value);
}

}
