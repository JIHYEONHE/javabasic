package Chapter13;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return studentNum == other.studentNum;

	}

	@Override
	public String toString() {
		return String.format("Student [studentNum=%s, name=%s]", studentNum, name);
	}
}
